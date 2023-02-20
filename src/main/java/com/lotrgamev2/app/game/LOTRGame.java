package com.lotrgamev2.app.game;

import java.util.ArrayList;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class LOTRGame {
    private Turns turns;
    private int squadSize;

    


    public void createDefaultCharacters(){
        turns = new Turns();
        execute();

    }

    public void createArmies(){
        turns = new Turns();
    }
    

    public void execute(){
        turns = new Turns();
        turns.startTurns();
    }
    
}
