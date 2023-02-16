package com.lotrgamev2.app.game;


public class Turns {
    private Armies armies;

    public void startTurns(){
        armies = new Armies();

        while(armies.getSquadA().size() > 0 ||armies.getSquadB().size() > 0){
            armies.fight();
        }

        if(armies.getSquadA().size() > 0){
            System.out.println("El equipo 1 gano");
        }else{
            System.out.println("El equipo 2 gano");
        }


    }
}
