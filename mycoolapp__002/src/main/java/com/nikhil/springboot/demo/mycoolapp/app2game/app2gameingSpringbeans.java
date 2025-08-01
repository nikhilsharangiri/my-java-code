package com.nikhil.springboot.demo.mycoolapp.app2game;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.nikhil.springboot.demo.mycoolapp.game.Ganingconsole;
import com.nikhil.springboot.demo.mycoolapp.game.game;
import com.nikhil.springboot.demo.mycoolapp.game.pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.nikhil.springboot.demo.mycoolapp.game;")



public class app2gameingSpringbeans {

    @Bean
    public game gamerun(Ganingconsole game){
        var gamerun=new game(game);
        return gamerun;
    }
    public static void main(String[] args) {

        try(
            var context = new AnnotationConfigApplicationContext(app2gameingSpringbeans.class);){

            context.getBean(Ganingconsole.class).up();
        }

    }
}
