package com.lotrgamev2.app.game;


public class Turns {
    private Armies armies;

    public void startTurns(){
        setArmies();
        

        while(!armies.isAnyArmyDefeated()){
            armies.fight();
        }

        if(armies.getSquadA().size() > 0){
            System.out.println("El equipo 1 gano");
        }else{
            System.out.println("El equipo 2 gano");
        }


    }

    public void setArmies() {
        armies = new Armies();
        armies.createArmies();
        //armies.createGenericSquads();
    }

    
    
}
