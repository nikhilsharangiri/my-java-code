package com.nikhil.springboot.demo.mycoolapp.app2game;

import com.nikhil.springboot.demo.mycoolapp.game.Ganingconsole;
import com.nikhil.springboot.demo.mycoolapp.game.game;
import com.nikhil.springboot.demo.mycoolapp.game.pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gamingconfiguration {
    @Bean
    public Ganingconsole game(){
        var game=new pacman();
        return game;
    }
    @Bean
    public game gamerun(Ganingconsole game){
        var gamerun=new game(game);
    }

}
