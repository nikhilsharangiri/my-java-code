package com.nikhil.springboot.demo.mycoolapp.game;

import com.nikhil.springboot.demo.mycoolapp.game.Ganingconsole;

public class mariogame implements Ganingconsole {
    public void up(){
        System.out.println("jump");

}

    @Override
    public void down() {
        System.out.println("down");
    }}


