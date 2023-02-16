package com.lotrgamev2.app.game.gameCharacters;

import com.lotrgamev2.app.game.interfaces.AttackCalculator;

public abstract class Characters implements AttackCalculator{
    protected int armor;
    protected String name;
    protected int healthPoints;

    public int getArmor() {
        return armor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getRandomAttack(int limit){
        int attack = (int) (Math.random() * limit + 1);
        return attack;
    }


}
