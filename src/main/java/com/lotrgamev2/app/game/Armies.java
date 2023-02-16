package com.lotrgamev2.app.game;

import java.util.ArrayList;
import java.util.Scanner;

import com.lotrgamev2.app.game.gameCharacters.Characters;

public class Armies {
    private ArrayList<Characters> squadA;
    private ArrayList<Characters> squadB;


    ArrayList<Characters> createArmie(){

        return new ArrayList<>();
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
