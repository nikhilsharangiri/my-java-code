package com.nikhil.springboot.demo.mycoolapp.app2game;

import com.nikhil.springboot.demo.mycoolapp.game.Ganingconsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app2gameingSpringbeans {
    public static void main(String[] args) {

        try(
            var context = new AnnotationConfigApplicationContext(gamingconfiguration.class);){

            context.getBean(Ganingconsole.class).up();
        }

    }
}
