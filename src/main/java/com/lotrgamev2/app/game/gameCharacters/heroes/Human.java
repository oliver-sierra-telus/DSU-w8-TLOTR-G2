package com.lotrgamev2.app.game.gameCharacters.heroes;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Human extends Characters{

    @Override
    public int calculatorFinalDamage() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAtack() {
        int attack1 = super.getRandomAttack(100);
        int attack2 = super.getRandomAttack(100);
        int maxAttack = Math.max(attack1, attack2);
        return maxAttack;
    }

    @Override
    public void defend(int damageAgainst) {
        healthPoints-=damageAgainst;
    }
    
}
