package com.lotrgamev2.app.game;

import com.lotrgamev2.app.game.gameCharacters.Characters;
import com.lotrgamev2.app.game.gameCharacters.beasts.Orcs;
import com.lotrgamev2.app.game.gameCharacters.beasts.Trasgos;
import com.lotrgamev2.app.game.gameCharacters.heroes.Elves;
import com.lotrgamev2.app.game.gameCharacters.heroes.Hobbits;
import com.lotrgamev2.app.game.gameCharacters.heroes.Human;

public class CharacterFactory {
    
    public Characters getNewCharacterHeroes(String characterType) {
        if (characterType == null) {
            return null;
        }
        if (characterType.equalsIgnoreCase("ELVES")) {
            return new Elves();
        } else if (characterType.equalsIgnoreCase("HOBBITS")) {
            return new Hobbits();
        } else if (characterType.equalsIgnoreCase("HUMAN")) {
            return new Human();
        }
        else if (characterType.equalsIgnoreCase("ORCS")) {
            return new Orcs();
        }
        else if (characterType.equalsIgnoreCase("TRASGOS")) {
            return new Trasgos();
        }
        return null;
    }
}
