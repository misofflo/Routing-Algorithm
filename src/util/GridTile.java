package util;

import javax.swing.*;
import java.util.Vector;

public class GridTile extends JPanel {
    // index codes
    public static int NO_OBSTACLE = 0;
    public static int OBSTACLE = 1;

    // specifies if that tile resembles an obstacle or not
    private final int index;

    // defines the position of the tile in the environment as integer coordinates
    private final int pos_x, pos_y;

    // constructor
    public GridTile(int _pos_x, int _pos_y, int _index) {
        index = _index;
        pos_x = _pos_x;
        pos_y = _pos_y;
    }

    // getter
    public int getIndex() {
        return index;
    }
}
