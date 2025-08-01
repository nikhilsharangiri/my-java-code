package com.nikhil.springboot.demo.mycoolapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name, int age,address add){}
record address(String firstline,String city){}

//record release in JDK 16

@Configuration
public class helloworldConfiguration {
    @Bean
    public String name() {
        return "nikhil";
    }


    @Bean
    public int age() {
        return 15;
    }
    @Bean
    Person person(){
        var person=new Person ("ravi",20,new address("mainstreet","london"));
        return person;
    }
    @Bean(name = "address2")
    address add(){
        var add=new address("sahadevkhunta","balasore");
        return add;
    }
    @Bean(name="p")
    Person person2Methodcall(){
        var person=new Person (name(),age(),add());
        return person;
    }
    @Bean
    public Person person3parameter(String name,int age,address add){
        return new Person(name, age, add);
    }

}
