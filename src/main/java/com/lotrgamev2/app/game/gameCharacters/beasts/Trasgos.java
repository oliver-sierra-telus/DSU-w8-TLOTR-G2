package com.lotrgamev2.app.game.gameCharacters.beasts;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Trasgos extends Characters {

    @Override
    public int calculatorFinalDamage() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAtack() {
        int attack = super.getRandomAttack(90);
        return attack;
    }

    @Override
    public void defend(int damageAgainst) {
        healthPoints-=damageAgainst;
    }
    
}
