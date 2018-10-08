package runner;

import critter.Critter;
import critter.CritterFactory;

import java.util.ArrayList;
import java.util.List;

public class BattleArena {

    private int numCritters;    //  Should be a power of 2
    private int numVictors;     //  Should be a power of 2

    public BattleArena(int numCritters) {
        this.numCritters = numCritters;
    }

    public List<Critter> generatePopulation() {
        List<Critter> critters = new ArrayList<>();

        int count = 0;
        while (count < numCritters) {
            Critter critter = CritterFactory.createBasicCritter();
            critters.add(critter);
            count++;
        }

        return critters;
    }

    public List<Critter> battle(List<Critter> critters) {

        int index = 0;
        while (index < critters.size()) {

            //  Battle current and next. Remove loser.


            index++;
            boolean outOfBounds = (index >= critters.size());
            boolean victorsFound = (numVictors == critters.size());
            if (outOfBounds && victorsFound) {
                index = 0;
            }
        }

        return critters;
    }
}
