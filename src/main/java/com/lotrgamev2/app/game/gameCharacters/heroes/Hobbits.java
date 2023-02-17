package com.lotrgamev2.app.game.gameCharacters.heroes;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Hobbits extends Characters{

    public Hobbits() {
        super();
        this.healthPoints = 200;
        this.armor = (int) (this.healthPoints * 0.15);
    }
}
