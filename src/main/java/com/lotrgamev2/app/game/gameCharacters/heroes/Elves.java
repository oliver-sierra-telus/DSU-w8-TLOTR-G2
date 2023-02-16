package com.lotrgamev2.app.game.gameCharacters.heroes;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Elves extends Characters{
    public final int hateAgainstOrcs = 10;
    
    @Override
    public int getAtack(int initialAttack, String enemy) {
        if(enemy.equalsIgnoreCase("ORCS")){
            return initialAttack + hateAgainstOrcs;
        }
        else {
            return initialAttack;
        }
    }

    @Override
    public void defend(int damageAgainst, String enemy) {
        int auxArmor = armor;
        if(enemy.equalsIgnoreCase("ORCS")){
            auxArmor = (int)(armor * 0.90);
        }
        if(auxArmor >= damageAgainst){
            System.out.println("EL ATAQUE HACIA " + name + "FALLO ");
        }else{
            System.out.println(name + " RECIBIO " + damageAgainst +" DE DAÑO");
            healthPoints-=damageAgainst;
        }
    }
}
