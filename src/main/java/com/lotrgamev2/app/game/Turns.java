package com.lotrgamev2.app.game;


public class Turns {
    private Armies armies;

    public void startTurns(){
        armies = new Armies();

        while(armies.getSquadA().size() > 0 ||armies.getSquadB().size() > 0){
            armies.fight();
        }


    }
}
