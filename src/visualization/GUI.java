package visualization;

import util.*;
import javax.swing.*;

public class GUI extends JFrame {
    private GridTile[][] tiles;

    public GUI(int width, int height) {
        setTitle("world.World visuals.Visualizer");
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setVisible(true);

        tiles = new GridTile[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new GridTile(new int[x][y], false);
                tiles[x][y].setBounds(x * 100 + 3, y * 100 + 3, 100, 100);
                add(tiles[x][y]);
            }
        }
    }
}
