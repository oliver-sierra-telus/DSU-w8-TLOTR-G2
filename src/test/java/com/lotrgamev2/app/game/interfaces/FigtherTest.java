package com.lotrgamev2.app.game.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FigtherTest {
    @Test
    public void shouldAtackOrcs() {
        Figther fighter = new Figther();
        int resultAtackOrcs = fighter.getAtack("ELVES",85, "ORCS");

        assertEquals(95, resultAtackOrcs);
    }

    @Test
    public void shouldAtackTrasgos(){
        Figther fighter = new Figther();
        int resultAtackOrcs = fighter.getAtack("HOBBITS",85, "TRASGOS");

        assertEquals(80, resultAtackOrcs);
    }

    @Test
    public void shouldDefendHumanVSOrcsWithDamage(){
        Figther fighter = new Figther();
        int result = fighter.defend("HUMAN", 5, "ORCS", 20);

        assertEquals(5, result);
    }

    @Test
    public void ShouldDefendBeastsAgaintsOther(){
        Figther fighter = new Figther();
        int result = fighter.defend("ORCS", 10, "ELVES", 40);
        assertEquals(10, result);
    }
}
