package com.lotrgamev2.app.game.gameCharacters;

import com.lotrgamev2.app.game.interfaces.AttackCalculator;

public abstract class Characters implements AttackCalculator{
    protected int armor;
    protected String name;
    protected int healthPoint;

    public int getArmor() {
        return armor;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getName() {
        return name;
    }
}
