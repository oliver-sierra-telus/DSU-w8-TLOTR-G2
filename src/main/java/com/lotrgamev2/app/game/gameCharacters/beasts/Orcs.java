package com.lotrgamev2.app.game.gameCharacters.beasts;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Orcs extends Characters{

    public double strenghtBonusAgaintsAll = 1.10;

    @Override
    public int calculatorFinalDamage() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAtack() {
        int attack = super.getRandomAttack(90);
        return (int)(attack*strenghtBonusAgaintsAll);
    }

    @Override
    public void defend(int damageAgainst) {
        healthPoints-=damageAgainst;
    }
    
}
