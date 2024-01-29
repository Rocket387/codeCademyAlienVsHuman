package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EntityTest {

    @Test
    public void entity() {
        Entity firstEntity = new Entity("blob", 100);

        assertEquals("Entity speaks", firstEntity.canSpeak("Entity speaks"));
    }

}