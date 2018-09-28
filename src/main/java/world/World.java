package world;

public class World {

    private char[][] tiles;

    public World(int len) {
        this(len, len);
    }

    public World(int height, int width) {
        this.tiles = new char[width][height];
    }

    public void setTile(int x, int y, char c) {
        this.tiles[x][y] = c;
    }

    public char getTile(int x, int y) {
        return this.tiles[x][y];
    }


    public void printWorld() {

        StringBuilder sb;
        for (int ii = 0; ii < tiles.length; ii++) {

            sb = new StringBuilder();
            for (int jj = 0; jj < tiles[0].length; jj++) {
                sb.append(tiles[ii][jj]).append(' ');
            }
            System.out.println(sb.toString());
        }
    }
}
