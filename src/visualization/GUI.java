package visualization;

import util.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUI extends JFrame {
    private GridTile[][] tiles;

    public GUI(int width, int height) {
        setTitle("world.World visuals.Visualizer");
        setSize(900, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);
        setVisible(true);

        Random rand = new Random();
        tiles = new GridTile[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new GridTile(new int[x][y], false);
                tiles[x][y].setBounds(x * getSize().width/10, y*getSize().height/10, getSize().width/10, getSize().height/10);
                tiles[x][y].setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                add(tiles[x][y]);
            }
        }

        repaint();
    }
}
