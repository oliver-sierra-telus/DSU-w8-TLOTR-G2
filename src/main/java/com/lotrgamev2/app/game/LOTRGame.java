package com.lotrgamev2.app.game;

public class LOTRGame {
    private Turns turns;
    private int squadSize;


    public void createArmies(){
        
    }
    

    public void execute(){
        squadSize = 3;
        turns = new Turns();
        turns.startTurns();
    }
    
}
