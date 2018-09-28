package world;

import java.util.Random;

public class WorldFactory {


    public static World createEmptyWorld(int len) {
        return new World(len);
    }

    public static World createRandomWorld(int len) {
        char[] tileOptions = {' ', '.', '~', '*', '#', '^'};
        Random random = new Random();
        char c;
        World world = new World(len);
        for (int ii = 0; ii < len; ii++) {
            for (int jj = 0; jj < len; jj++) {
                c = tileOptions[random.nextInt(tileOptions.length)];
                world.setTile(ii, jj, c);
            }
        }
        return world;
    }
}
