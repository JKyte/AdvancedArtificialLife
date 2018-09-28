package combat;

import critter.Critter;
import critter.CritterFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CritterCombatTest {

    private Critter a;
    private Critter b;

    private CritterCombat combat;

    @Before
    public void setup() {
        a = CritterFactory.createEmptyCritter();
        b = CritterFactory.createEmptyCritter();

        a.setHealth(10);
        b.setHealth(10);

        combat = new CritterCombat();
    }

    @Test
    public void testStillFighting() {
        Assert.assertTrue(combat.stillFighting(a, b));
    }

    @Test
    public void testRawAttack() {
        a.setStrength(20);
        combat.attack(a, b);
        Assert.assertEquals(-10, b.getHealth());
        Assert.assertFalse(combat.stillFighting(a, b));
    }

    @Test
    public void testRawAttackWithArmor() {
        a.setStrength(20);
        b.setArmor(5);
        combat.attack(a, b);
        Assert.assertEquals(-5, b.getHealth());
        Assert.assertFalse(combat.stillFighting(a, b));
    }

    @Test
    public void testPierceAttackWithArmor() {
        a.setStrength(5);
        a.setPierce(1);
        b.setHealth(5);
        b.setArmor(5);
        combat.attack(a, b);
        Assert.assertEquals(4, b.getHealth());
        Assert.assertTrue(combat.stillFighting(a, b));
    }

}
