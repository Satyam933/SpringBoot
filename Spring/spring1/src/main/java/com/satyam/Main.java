package com.satyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Insane obj = new Insane(); we have to do it by spring.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        Insane obj = (Insane) context.getBean("insane");
        System.out.print("I'M Insane ");
        obj.run();
    }
}