package critter;

import java.util.UUID;

public class Critter {

    private UUID critterID;

    private int vision;
    private int strength;
    private int speed;
    private int health;
    private int armor;
    private int pierce;

    public Critter(){

    }

    public UUID getCritterID() {
        return critterID;
    }

    public void setCritterID(UUID critterID) {
        this.critterID = critterID;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getPierce() {
        return pierce;
    }

    public void setPierce(int pierce) {
        this.pierce = pierce;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }
}
