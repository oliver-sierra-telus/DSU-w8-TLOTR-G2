package com.lotrgamev2.app.game.gameCharacters.heroes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class ElvesTest {
    private Characters elves;
    private int health;
    private int armor;

    @Before
    public void setUp(){
        elves = new Elves();
        health = elves.getHealthPoints();
        armor = elves.getArmor();
    }

    @Test
    public void testDefend() {
        elves.defend(100, "ORCS");
        int expect = health - (100 - ((int) (armor * 0.90)));
        assertEquals(expect, elves.getHealthPoints());
    }

    @Test
    public void testGetArmor() {
        int newArmor = (int) (250 * 0.15);
        assertEquals(newArmor, elves.getArmor());
    }

    @Test
    public void testGetAtack() {
        int attackEnemy = elves.getAtack("ELVES", 180, "ORCS");
        assertEquals(190, attackEnemy);
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(250, elves.getHealthPoints());
    }
}
