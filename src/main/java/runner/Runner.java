package runner;

import world.World;
import world.WorldFactory;

public class Runner {

    public static void main(String args[]) {
        System.out.println("Running world...");

        World world = WorldFactory.createRandomWorld(7);
        world.printWorld();

        System.out.println("Run completed.");
    }
}
