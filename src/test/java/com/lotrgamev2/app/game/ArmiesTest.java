package com.lotrgamev2.app.game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.lotrgamev2.app.game.gameCharacters.Characters;
import com.lotrgamev2.app.game.gameCharacters.heroes.Elves;

public class ArmiesTest {
    Armies army = new Armies();

    ArrayList<Characters> squadA;
    ArrayList<Characters> squadB;

    @Test
    public void AnyArmyDefeatedisFalse() {
        army.createGenericSquads();
        boolean result = army.isAnyArmyDefeated();
        assertEquals(false, result);
    }

    @Test
    public void shouldThowDicesOneTimeAndVerifyRange() {
        int result = army.throwDice(1, 90);
        assertTrue(0 <= result && result <= 90);
    }

    @Test
    public void shouldThowDicesTwoTimesAndVerifyRange() {
        int result = army.throwDice(2, 100);
        assertTrue(0 <= result && result <= 100);
    }

    @Test
    public void shouldnotDeleteCharactersSquadIfIsAlive() {
        CharacterFactory factory = new CharacterFactory();
        squadA = new ArrayList<>();
        squadA.add(factory.getNewCharacter("ELVES"));

        boolean output = squadA.removeIf((e) -> (e.getHealthPoints() <= 0));
        assertFalse(output);
    }
}
