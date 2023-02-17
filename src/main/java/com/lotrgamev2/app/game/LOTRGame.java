package com.lotrgamev2.app.game;

import java.util.ArrayList;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class LOTRGame {
    private Turns turns;
    private int squadSize;


    public void createArmies(){
        turns = new Turns();
        execute();

    }
    

    public void execute(){
        
        turns.startTurns();
    }
    
}
