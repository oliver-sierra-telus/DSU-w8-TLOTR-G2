package com.lotrgamev2.app.game.gameCharacters.heroes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class HobbitsTest {
    private Characters hobbits;
    private int health;
    private int armor;

    @Before
    public void setUp(){
        hobbits = new Hobbits();
        health = hobbits.getHealthPoints();
        armor = hobbits.getArmor();
    }
    
    @Test
    public void testDefend() {
        hobbits.defend(180, "TRASGOS");
        int expect = health - (180 - ((int) (health * 0.15)));
        assertEquals(expect, hobbits.getHealthPoints());
    }

    @Test
    public void testGetArmor() {
        int newArmor = (int) (200 * 0.15);
        assertEquals(newArmor, hobbits.getArmor());
    }

    @Test
    public void testGetAtack() {
        int attackEnemy = hobbits.getAtack("HOBBITS", 100, "TRASGOS");
        assertEquals(95, attackEnemy);
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(200, hobbits.getHealthPoints());
    }
}
