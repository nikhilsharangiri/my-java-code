package com.nikhil.springboot.demo.mycoolapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app02helloworldspring {
    public static void main(String[] args) {
//        launches a spring context
       var context= new AnnotationConfigApplicationContext(helloworldConfiguration.class);
//        configure the things we want  spring to manage- @Configuration
//         -> Helloworldconfiguration - @Configuraton
//        -> name-@Bean
//         retrieving bean manage by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("p"));
        System.out.println(context.getBean("person3parameter"));

    }
}
