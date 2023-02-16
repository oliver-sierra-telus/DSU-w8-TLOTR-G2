package com.lotrgamev2.app.game;

import java.util.ArrayList;
import java.util.Scanner;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Armies {
    private ArrayList<Characters> squadA;
    private ArrayList<Characters> squadB;


    public void createArmies(){
        CharacterFactory charFactory = new CharacterFactory();
        int option = 0;
        int nHumans = 0, nElves= 0, nHobbis= 0, nOrcs= 0, nTrasgos= 0;
        squadA = new ArrayList<>();
        squadB = new ArrayList<>();

        System.out.println("================SETTING FIGHTERS================");
        do{
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

            switch(option){
                case 1:{
                    System.out.println("How many human would you like to set?");
                    nHumans += sc.nextInt();
                    break;
                }
                case 2:{
                    System.out.println("How many elves would you like to set?");
                    nElves += sc.nextInt();
                    break;
                }
                case 3:{
                    System.out.println("How many hobbits would you like to set?");
                    nHobbis += sc.nextInt();
                    break;
                }
                case 4:{
                    System.out.println("How many orcs would you like to set?");
                    nOrcs += sc.nextInt();
                    break;
                }
                case 5:{
                    System.out.println("How many trasgos would you like to set?");
                    nTrasgos += sc.nextInt();
                    break;
                }
                default:{
                    System.out.println("> Leaving menu fighter...");
                    break;
                }
            }
        }while(option != 6);

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
        //TO REMOVE COMMENTS
        System.out.println(">Humanos: " + nHumans);
        System.out.println(">Hobbits: " + nHobbis);
        System.out.println(">Elves: " + nElves);
        System.out.println(">Orcs: " + nOrcs);
        System.out.println(">Trasgos: " + nTrasgos);
        System.out.println(">Size squad a: " + squadA.size());
        System.out.println(">Size squad b: " + squadB.size());
    }

    public void fight(){
        Scanner in = new Scanner(System.in);
        int roundsToFight = Math.min(squadA.size(), squadB.size());
        showAttackWaveText();

        for (int i = 0; i < roundsToFight; i++) {
            Characters hero = squadA.get(i);
            Characters beast = squadB.get(i);
            int heroAttack;
            int beastAttack;


            showRoundText(i);
            System.out.println(" Los personajes a enfrentar son: " + hero.getName() 
            + " VS " + beast.getName());

            System.out.println(hero.getName() + " tiene " + hero.getHealthPoints() +" hp" );
            System.out.println(beast.getName() + " tiene " + beast.getHealthPoints() +" hp" );
            






            System.out.println(hero.getName() + " ATACA ");

            in.nextLine();
        }
        deleteDeadCharacters();

    }

    public ArrayList<Characters> getSquadA() {
        return squadA;
    }

    public ArrayList<Characters> getSquadB() {
        return squadB;
    }

    public void deleteDeadCharacters(){
        squadA.removeIf( (e) -> (e.getHealthPoints()<= 0));
        squadB.removeIf( (e) -> (e.getHealthPoints()<= 0));
    }

    public void showRoundText(int roundNumber){
        separator();
        System.out.println("  |La ronda " + (roundNumber+1 + " va a comenzar: |"));
        separator();
        
    }

    public void separator(){
        System.out.println("------------------------------------------------");
    }

    public void showAttackWaveText(){
        separator();
        System.out.println("|       Nueva oleada de ataques comienza...    |");
        System.out.println("|        Los batallones a enfrentarse son:     |");
        separator();
        System.out.println("Batallon de heroes :" + squadA.toString());
        System.out.println("Batallon de Bestias:" + squadB.toString());
        separator();
        System.out.println();
    }

    public int throwDice(int diceTimes, int limit){
        return ((int) (Math.random() * limit + 1));
    }

}
