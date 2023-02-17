package com.lotrgamev2.app.game.interfaces;

public class Figther implements AttackCalculator, DefendCalculator {

    public final int elvesHateAgainstOrcs = 10;
    public final int hobbitsFearAgainstTrasgos = 5;

    @Override
    public int defend(String character, int damage, String enemy, int armor) {
        int auxArmor = armor;
        int finalDamage = damage;
        if (character.equalsIgnoreCase("HUMAN") || character.equalsIgnoreCase("ELVES")
                || character.equalsIgnoreCase("HOBBITS")) {
            if (enemy.equalsIgnoreCase("ORCS")) {
                System.out.println(character+" se reduce su armadura en 10 unidades");
                auxArmor = (int) (armor * 0.90);
            }
            if (auxArmor >= damage) {
                System.out.println("EL ATAQUE HACIA " + character + " FALLO ");
            } else {
                finalDamage -= auxArmor;
                System.out.println(character + " RECIBIO " + finalDamage + " DE DAÑO");
            }
        } else {
            if (auxArmor >= damage) {
                System.out.println("EL ATAQUE HACIA " + character + " FALLO ");
            } else {
                finalDamage -= auxArmor;
                System.out.println(character + " RECIBIO " + finalDamage + " DE DAÑO");

            }
        }
        return finalDamage;
    }

    @Override
    public int getAtack(String character,int initialAttack, String enemy) {
        if (character.equalsIgnoreCase("ELVES") && enemy.equalsIgnoreCase("ORCS")) {
            System.out.println(character + " obtiene bonus de daño hacia " + enemy);
            return initialAttack + elvesHateAgainstOrcs;
        } else if (character.equalsIgnoreCase("HOBBITS") && enemy.equalsIgnoreCase("TRASGOS")) {
            System.out.println(character + " se reduce su daño hacia " + enemy);
            return initialAttack - hobbitsFearAgainstTrasgos;
        } else {
            return initialAttack;
        }
    }

}
