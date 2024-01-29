package org.example;

public class Alien extends Entity {

    boolean power;

    public Alien(String hasName, int hasHealth, boolean hasPower) {
        super(hasName,hasHealth);
        this.power = hasPower;
    }

    public String powerType(String power) {

        return power;
    }

    public static void main(String[] args) {
        Alien one = new Alien("derek", 100, true);

        one.takeDamage(20);
        one.getHitPoints();
    }
}
