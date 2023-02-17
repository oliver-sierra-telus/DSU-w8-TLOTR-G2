package com.lotrgamev2.app.game.gameCharacters.heroes;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Elves extends Characters{
    public Elves() {
        super();
        this.healthPoints = 250;
        this.armor = (int) (this.healthPoints * 0.15);
    }
}
