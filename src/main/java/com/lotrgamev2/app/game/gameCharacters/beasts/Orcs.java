package com.lotrgamev2.app.game.gameCharacters.beasts;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Orcs extends Characters{

    public Orcs(){
        super();
        this.name = "ORCS";
        this.armor = (int) (this.healthPoints * 0.15);
        this.healthPoints = 300;
    }
    
}
