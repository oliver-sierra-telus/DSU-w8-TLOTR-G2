package com.lotrgamev2.app.game;

import java.util.ArrayList;
import java.util.Scanner;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Armies {
    private ArrayList<Characters> squadA;
    private ArrayList<Characters> squadB;


    public void fight() {
        Scanner in = new Scanner(System.in);
        int roundsToFight = Math.min(squadA.size(), squadB.size());
        showAttackWaveText();

        for (int i = 0; i < roundsToFight; i++) {
            Characters hero = squadA.get(i);
            Characters beast = squadB.get(i);
            int heroBaseAttack  = throwDice(2, 100);
            int beastBasetAttack = throwDice(1, 90);
            int heroFinalAttack;
            int beastFinalAttack;

            showRoundText(i);
            System.out.println("The characters who will fight are: " + hero.getName()
                    + " VS " + beast.getName());

            System.out.println(hero.getName() + " has " + hero.getHealthPoints() + " hp");
            System.out.println(beast.getName() + " has " + beast.getHealthPoints() + " hp");
            System.out.println();

            System.out.println("================THE BATTLE JUST BEGINS==========");
            heroFinalAttack = hero.getAtack(hero.getName(), heroBaseAttack, beast.getName());
            beast.defend(heroFinalAttack, hero.getName());
            System.out.println("------------------------------------------------");
            beastFinalAttack = beast.getAtack(beast.getName(), beastBasetAttack, hero.getName());
            hero.defend(beastFinalAttack, beast.getName());
            System.out.println("================================================");
            
            in.nextLine();
        }
        deleteDeadCharacters();

    }


    public void deleteDeadCharacters() {
        squadA.removeIf((e) -> (e.getHealthPoints() <= 0));
        squadB.removeIf((e) -> (e.getHealthPoints() <= 0));
    }

    public void showRoundText(int roundNumber) {
        System.out.println("################################################");
        separator();
        System.out.println("#|  Round numer " + (roundNumber + 1) +  " is about to start:          |#");
        separator();

    }

    public void separator() {
        System.out.println("================================================");
    }

    public void showAttackWaveText() {
        System.out.println();
        System.out.println();
        System.out.println();
        separator();
        System.out.println("|         New attack wave just started!!!      |");
        System.out.println("|  The squads that will fight each other are:  |");
        separator();
        System.out.println("Hero's squad  :" + squadA.toString());
        System.out.println("Beast's squad :" + squadB.toString());
        System.out.println();
    }

    public int throwDice(int diceTimes, int limit) {
        int damage;
        if(diceTimes==2){
            damage = Math.max((int) (Math.random() * limit + 1), (int) (Math.random() * limit + 1));
        }
        else{
            damage = (int) (Math.random() * limit + 1);
        }

        return damage;
    }

    public boolean isAnyArmyDefeated() {
        if (getSquadA().size() == 0 || getSquadB().size() == 0) {
            return true;
        }
        return false;
    }

    public void setSquadA(ArrayList<Characters> squadA) {
        this.squadA = squadA;
    }

    public void setSquadB(ArrayList<Characters> squadB) {
        this.squadB = squadB;
    }

    public ArrayList<Characters> getSquadA() {
        return squadA;
    }

    public ArrayList<Characters> getSquadB() {
        return squadB;
    }
    
    public void createGenericSquads() {
        CharacterFactory factory = new CharacterFactory();
        squadA = new ArrayList<>();
        squadB = new ArrayList<>();
        squadA.add(factory.getNewCharacter("ELVES"));
        squadA.add(factory.getNewCharacter("HOBBITS"));
        squadB.add(factory.getNewCharacter("ORCS"));
        squadB.add(factory.getNewCharacter("TRASGOS"));

    }

    public void createArmies() {
        CharacterFactory charFactory = new CharacterFactory();
        int option = 0;
        int nHumans = 0, nElves = 0, nHobbis = 0, nOrcs = 0, nTrasgos = 0;
        squadA = new ArrayList<>();
        squadB = new ArrayList<>();

        System.out.println("================SETTING FIGHTERS================");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------------------------");
            System.out.println("> Which character would you like to create?");
            System.out.println("> 1. Human");
            System.out.println("> 2. Elves");
            System.out.println("> 3. Hobbits");
            System.out.println("> 4. Orcs");
            System.out.println("> 5. Trasgos");
            System.out.println("> 6. EXIT MENU");
            System.out.println("================================================");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("How many human would you like to set?");
                    nHumans += sc.nextInt();
                    break;
                }
                case 2: {
                    System.out.println("How many elves would you like to set?");
                    nElves += sc.nextInt();
                    break;
                }
                case 3: {
                    System.out.println("How many hobbits would you like to set?");
                    nHobbis += sc.nextInt();
                    break;
                }
                case 4: {
                    System.out.println("How many orcs would you like to set?");
                    nOrcs += sc.nextInt();
                    break;
                }
                case 5: {
                    System.out.println("How many trasgos would you like to set?");
                    nTrasgos += sc.nextInt();
                    break;
                }
                default: {
                    System.out.println("> Leaving menu fighter...");
                    break;
                }
            }
        } while (option != 6);

        for (int i = 0; i < nElves; i++) {
            squadA.add(charFactory.getNewCharacter("ELVES"));
        }
        for (int i = 0; i < nHobbis; i++) {
            squadA.add(charFactory.getNewCharacter("HOBBITS"));
        }
        for (int i = 0; i < nHumans; i++) {
            squadA.add(charFactory.getNewCharacter("HUMANS"));
        }
        for (int i = 0; i < nOrcs; i++) {
            squadB.add(charFactory.getNewCharacter("ORCS"));
        }
        for (int i = 0; i < nTrasgos; i++) {
            squadB.add(charFactory.getNewCharacter("TRASGOS"));
        }
        System.out.println("================================================");
        System.out.println();
    }
}
