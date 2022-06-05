package visualization;

import util.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUI extends JFrame {
    private GridTile[][] tiles;

    private Random rand;

    // constructors
    public GUI(int _width, int _height) {
        rand = new Random();
        int[][] obstDataTemp = new int[_width][_height];
        for (int i = 0; i < _width; i++) {
            for (int j = 0; j < _height; j++) {
                obstDataTemp[i][j] = rand.nextInt(0, 2);
            }
        }
        init(_width, _height, obstDataTemp);
    }
    public GUI(int _width, int _height, int[][] _obstData) {
        init(_width, _height, _obstData);
    }

    // initialising GUI components
    private void init(int _width, int _height, int[][] obstData) {
        setTitle("world.World visuals.Visualizer");
        getContentPane().setPreferredSize(new Dimension(800, 800));
        //setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);
        setVisible(true);
        pack();

        tiles = new GridTile[_width][_height];

        for (int x = 0; x < _width; x++) {
            for (int y = 0; y < _height; y++) {
                tiles[x][y] = new GridTile(x, y, obstData[x][y]);
                tiles[x][y].setBounds(x*getContentPane().getWidth()/_width, y*getContentPane().getHeight()/_height, getContentPane().getWidth()/10, getContentPane().getHeight()/10);
                if (obstData[x][y] == GridTile.OBSTACLE) tiles[x][y].setBackground(new Color(0, 0, 0, 252));
                else if (obstData[x][y] == GridTile.NO_OBSTACLE) tiles[x][y].setBackground(new Color(255, 255, 255, 255));
                else tiles[x][y].setBackground(new Color(255, 0, 204));
                add(tiles[x][y]);
            }
        }
        repaint();
    }

    // getter
    public GridTile[][] getTiles() {
        return tiles;
    }
}