package com.lotrgamev2.app.game.gameCharacters.beasts;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Orcs extends Characters{

    @Override
    public int getAtack(int initialAttack, String enemy) {
        return initialAttack;
    }

    @Override
    public void defend(int damageAgainst, String enemy) {
        if(armor >= damageAgainst){
            System.out.println("EL ATAQUE HACIA " + name + "FALLO ");
        }else{
            System.out.println(name + " RECIBIO " + damageAgainst +" DE DAÑO");
            healthPoints-=damageAgainst;
        }
    }
    
}
