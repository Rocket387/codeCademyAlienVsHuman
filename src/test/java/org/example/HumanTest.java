package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class HumanTest

{
    Human sam;

    @Before
    public void createHuman() {
       sam = new Human("Sam", 100, 45);
    }

    @Test
    public void testHuman() {

        assertEquals(100, sam.getHitPoints());
        assertEquals("Sam", sam.getName());
        assertEquals(45, sam.getAge());
    }

    @Test
    public void testSpeak() {
        assertEquals("Entity speaks", sam.canSpeak("Entity speaks"));
    }

    @Test
    public void testTakeDamage() {
        assertEquals(100, sam.getHitPoints());
        sam.takeDamage(20);
        assertEquals(80, sam.getHitPoints());
    }

    @Test
    public void testEatFood() {
        Human Charlie = new Human("Charlie", 80, 45);
        assertEquals(80, Charlie.getHitPoints());
        Charlie.eatFood(20);
        assertEquals(100, Charlie.getHitPoints());
    }
}
