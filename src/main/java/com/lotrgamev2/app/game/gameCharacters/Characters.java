package com.lotrgamev2.app.game.gameCharacters;

import com.lotrgamev2.app.game.interfaces.Figther;

public abstract class Characters{
    protected int armor;
    protected String name;
    protected int healthPoints;


    Figther figther = new Figther();

    public void defend(int damage, String enemy) {
        this.healthPoints -= figther.defend(this.name, damage, enemy, this.armor);

        if (this.healthPoints <= 0) {
            System.out.println(this.name + " HA SIDO VENCIDO");
            this.healthPoints = 0;
        }
    }

    public int getAtack(String character,int initialAttack, String enemy) {
        return figther.getAtack(this.name,initialAttack, enemy);
    }


    public int getArmor() {
        return armor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getRandomAttack(int limit, int diceTimes){
        int attack = (int) (Math.random() * limit + 1);
        return attack;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
}
