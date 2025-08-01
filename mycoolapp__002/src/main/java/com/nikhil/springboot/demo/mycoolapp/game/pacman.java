package com.nikhil.springboot.demo.mycoolapp.game;

import com.nikhil.springboot.demo.mycoolapp.game.Ganingconsole;
import org.springframework.stereotype.Component;

@Component
public class pacman implements Ganingconsole {
    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("down");

    }
}
