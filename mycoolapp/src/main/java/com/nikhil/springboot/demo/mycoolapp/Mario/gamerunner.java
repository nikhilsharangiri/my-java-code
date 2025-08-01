package com.nikhil.springboot.demo.mycoolapp.Mario;

import com.nikhil.springboot.demo.mycoolapp.game.game;
import com.nikhil.springboot.demo.mycoolapp.game.pacman;

public class gamerunner {
    public static void main(String[] args) {

//        var gaame = new mariogame();
//        var gaame= new Supercontra();
        var gaame = new pacman();//1:object creation
        var game = new game(gaame);
        //2: Object creation + wiring of dependencies
//        Game is dependency of game  class
        //why we use var -
        game.run();
    }
}
