package com.lotrgamev2.app.game.gameCharacters.beasts;
import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Trasgos extends Characters {

    public Trasgos() {
        super();
        this.name = "TRASGOS";
        this.healthPoints = 325;
        this.armor = (int) (this.healthPoints * 0.15);
    }
}
