package util;

import javax.swing.*;

public class GridTile extends JPanel {
    // specifies if that tile resembles an obstacle or not
    private final boolean obst;

    // defines the position of the tile in the environment as integer coordinates
    private final int[][] pos;

    // constructor
    public GridTile(int[][] _pos, boolean _obst) {
        obst = _obst;
        pos = _pos;
    }

    // getter
    public int[][] getPos() {
        return pos;
    }

    public boolean isObst() {
        return obst;
    }
}
