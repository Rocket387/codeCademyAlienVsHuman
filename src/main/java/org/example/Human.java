package org.example;

/**
 * Hello world!
 *
 */
public class Human extends Entity
{
    int age;
    int food;
    public Human(String hasName, int hasHealth, int age) {
        super(hasName, hasHealth);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHitPoints() {

        health = health - damage;
        health = health + food;
        return health;
    }

    public int eatFood(int food) {
        this.food = food;
        return food;
    }
}
