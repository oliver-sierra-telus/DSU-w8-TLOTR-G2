package com.lotrgamev2.app;

import com.lotrgamev2.app.game.Armies;
import com.lotrgamev2.app.game.LOTRGame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Armies ar = new Armies();
        //ar.createArmies();
        LOTRGame game = new LOTRGame();
        game.createArmies();
        game.execute();
    }
}
