package com.lotrgamev2.app.game.gameCharacters.beasts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class TrasgosTest {
    private Characters trasgo;
    private int life;
    private int armor;

    @Before
    public void setUp(){
        trasgo = new Trasgos();
        life = trasgo.getHealthPoints();
        armor = trasgo.getArmor();
    }

    @Test
    public void testDefend() {
        trasgo.defend(200,"HUMAN");
        assertEquals((life-(200-armor)),trasgo.getHealthPoints());
    }

    @Test
    public void testGetArmor() {
        int auxArmor = (int) (325 * 0.15);
        assertEquals(auxArmor, trasgo.getArmor());
    }

    @Test
    public void testGetAtack() {
        int attack = trasgo.getAtack("TRASGOS", 50, "HUMAN");
        assertEquals(50, attack);
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(325,trasgo.getHealthPoints());
    }
}
