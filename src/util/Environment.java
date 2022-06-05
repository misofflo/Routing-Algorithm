package util;

/* environment in which the agent will try to navigate
* it is constructed of grid tiles for easier handling */
public class Environment {
    // the environment in which the agent can operate
    private GridTile[][] tiles;

    // constructor
    public Environment(int size_x, int size_y, boolean[][] activation) {
        // initialising the environment with tiles
        tiles = new GridTile[size_x][size_y];

        // initialising every single tile with position and obstacle information
        for (int x = 0; x < size_x; x++) {
            for (int y = 0; y < size_y; y++) {
                tiles[x][y] = new GridTile(new int[x][y], activation[x][y]);
            }
        }
    }
}
