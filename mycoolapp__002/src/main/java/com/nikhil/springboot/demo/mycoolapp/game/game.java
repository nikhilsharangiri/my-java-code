package com.nikhil.springboot.demo.mycoolapp.game;

public class game {
    private Ganingconsole ame;



    public game(Ganingconsole ame){
        this.ame=ame;
    }
    public void run(){
        System.out.println("running" + ame);
        ame.up();
        ame.down();
    }
}
