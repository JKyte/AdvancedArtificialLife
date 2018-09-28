package combat;

import critter.Critter;

public class CritterCombat {

    public Critter fight(Critter a, Critter b) {

        while (stillFighting(a, b)) {
            attack(a, b);
            attack(b, a);
        }
        return a;
    }

    public void attack(Critter attacker, Critter defender) {
        int damageDealt = attacker.getStrength();
        int damageReduction = defender.getArmor() - attacker.getPierce();
        damageReduction = Math.max(damageReduction, 0);

        damageDealt -= damageReduction;
        damageDealt = Math.max(damageDealt, 0);

        int newHealth = defender.getHealth() - damageDealt;
        defender.setHealth(newHealth);
    }

    public boolean stillFighting(Critter a, Critter b) {
        return a.getHealth() > 0 && b.getHealth() > 0;
    }
}
