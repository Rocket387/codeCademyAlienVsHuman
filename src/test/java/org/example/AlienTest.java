package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlienTest {

    @Test
    public void testAlien() {
        Alien firstAlien = new Alien("Kreeler", 100, true);

        assertEquals(100, firstAlien.health);
        assertEquals("Kreeler",firstAlien.name);
        assertTrue(firstAlien.power);
    }

    @Test
    public void testAlienPower() {
        Alien firstAlien = new Alien("Kreeler", 100, true);

        assertEquals("Invisibility", firstAlien.powerType("Invisibility"));

    }



}