package com.lotrgamev2.app.game.gameCharacters.heroes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class HumanTest {
    private Characters humans;
    private int health;
    private int armor;

    @Before
    public void setUp(){
        humans = new Hobbits();
        health = humans.getHealthPoints();
        armor = humans.getArmor();
    }

    @Test
    public void testDefend() {
        humans.defend(70, "TRASGOS");
        int expect = health - (70 - ((int) (health * 0.15)));
        assertEquals(expect, humans.getHealthPoints());
    }

    @Test
    public void testGetArmor() {
        int newArmor = (int) (200 * 0.15);
        assertEquals(newArmor, humans.getArmor());
    }

    @Test
    public void testGetAtack() {
        int attackEnemy = humans.getAtack("HUMANS", 60, "TRASGOS");
        assertEquals(55, attackEnemy);
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(200, humans.getHealthPoints());
    }
}
