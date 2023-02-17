package com.lotrgamev2.app.game.gameCharacters.heroes;

import com.lotrgamev2.app.game.gameCharacters.Characters;
import com.lotrgamev2.app.game.interfaces.Impl.HeroDefendCalculatorImpl;

public class Human extends Characters{ 
    private HeroDefendCalculatorImpl defend;
    

    @Override
    public int getAtack(int initialAttack, String enemy) {
        return initialAttack;
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
