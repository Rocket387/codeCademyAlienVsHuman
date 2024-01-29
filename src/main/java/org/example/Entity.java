package org.example;

public class Entity {

    String name;

    int health;

    int damage;

    public Entity(String hasName, int hasHealth) {
        this.name = hasName;
        this.health = hasHealth;
    }

    public String canSpeak(String speak) {
        System.out.println("Entity speaks");
        return speak;
    }

    public int getHitPoints() {

        health = health - damage;
        return health;
    }

    public int takeDamage(int damage) {
        this.damage = damage;
        return damage;
    }

}
