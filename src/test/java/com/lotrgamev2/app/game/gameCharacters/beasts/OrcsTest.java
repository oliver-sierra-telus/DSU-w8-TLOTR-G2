package com.lotrgamev2.app.game.gameCharacters.beasts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lotrgamev2.app.game.gameCharacters.Characters;
import com.lotrgamev2.app.game.gameCharacters.heroes.Elves;

public class OrcsTest {
    private Characters orc;
    private int life;
    private int armor;
    
    @Before
    public void setUp(){
        orc = new Orcs();
        life = orc.getHealthPoints();
        armor = orc.getArmor();
    }

    @Test
    public void testDefend() {
        orc.defend(200,"HUMAN");
        assertEquals((life-(200-armor)),orc.getHealthPoints());
    }

    @Test
    public void testDefendAgainstElves() {
        Characters elve = new Elves();
        int elveAttack = elve.getAtack("ELVES", 200, "ORCS");

        orc.defend(elveAttack,"ELVES");
        assertEquals((life-(210-armor)),orc.getHealthPoints());
    }

    @Test
    public void testGetArmor() {
        int auxArmor = (int) (300 * 0.15);
        assertEquals(auxArmor, orc.getArmor());
    }

    @Test
    public void testGetAtack() {
        int attack = orc.getAtack("ORCS", 50, "HUMAN");
        assertEquals(50, attack);
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(300,orc.getHealthPoints());
    }

}
