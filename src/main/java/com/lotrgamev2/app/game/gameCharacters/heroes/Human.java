package com.lotrgamev2.app.game.gameCharacters.heroes;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Human extends Characters{

    public Human() {
        super();
        this.healthPoints = 180;
        this.armor = (int) (this.healthPoints * 0.15);
    }
}
