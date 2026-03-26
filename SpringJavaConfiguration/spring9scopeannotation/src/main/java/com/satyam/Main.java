package com.satyam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Insane obj = context.getBean(Insane.class);
            obj.runInsane1();
            Insane obj1 = context.getBean(Insane.class);
            obj1.runInsane2();
        }
    }
}