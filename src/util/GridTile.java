package util;

import javax.swing.*;

public class GridTile extends JPanel {
    public static int NO_OBSTACLE = 0;
    public static int OBSTACLE = 1;

    // specifies if that tile resembles an obstacle or not
    private final int index;

    // defines the position of the tile in the environment as integer coordinates
    private final int[][] pos;

    // constructor
    public GridTile(int[][] _pos, int _index) {
        index = _index;
        pos = _pos;
    }

    // getter
    public int[][] getPos() {
        return pos;
    }

    public int getIndex() {
        return index;
    }
}
