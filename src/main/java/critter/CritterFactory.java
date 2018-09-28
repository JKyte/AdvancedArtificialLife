package critter;

import java.util.Random;

public class CritterFactory {

    public static Critter createEmptyCritter() {
        Critter critter = new Critter();
        critter.setVision(0);
        critter.setStrength(0);
        critter.setSpeed(0);
        critter.setHealth(0);
        critter.setArmor(0);
        critter.setPierce(0);
        return critter;
    }

    public static Critter createRandomCritter() {
        Random random = new Random();
        Critter critter = new Critter();
        critter.setVision(random.nextInt(20));
        critter.setStrength(random.nextInt(20));
        critter.setSpeed(random.nextInt(20));
        critter.setHealth(random.nextInt(20));
        critter.setArmor(random.nextInt(20));
        critter.setPierce(random.nextInt(20));
        return critter;
    }
}
