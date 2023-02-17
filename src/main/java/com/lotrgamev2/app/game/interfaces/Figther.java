package com.lotrgamev2.app.game.interfaces;

public class Figther implements AttackCalculator, DefendCalculator {

    public final int hateAgainstOrcs = 10;
    public final int fearAgainstTrasgos = 5;

    @Override
    public int defend(String character, int damage, String enemy, int armor, int healthP) {

        int auxArmor = armor;

        if (character.equalsIgnoreCase("HUMAN") || character.equalsIgnoreCase("ELVES")
                || character.equalsIgnoreCase("HOBBITS")) {
            if (enemy.equalsIgnoreCase("ORCS")) {
                auxArmor = (int) (armor * 0.90);
            }
            if (auxArmor >= damage) {
                System.out.println("EL ATAQUE HACIA " + character + "FALLO ");
            } else {
                System.out.println(character + " RECIBIO " + damage + " DE DAÑO");
                healthP -= damage;
            }
        } else {
            if (auxArmor >= damage) {
                System.out.println("EL ATAQUE HACIA " + character + "FALLO ");
            } else {
                System.out.println(character + " RECIBIO " + damage + " DE DAÑO");
                healthP -= damage;
            }
        }
        return auxArmor;
    }

    @Override
    public int getAtack(int initialAttack, String enemy) {
        if (enemy.equalsIgnoreCase("ORCS")) {
            return initialAttack + hateAgainstOrcs;
        } else if (enemy.equalsIgnoreCase("TRASGOS")) {
            return initialAttack - fearAgainstTrasgos;
        } else {
            return initialAttack;
        }
    }

}
