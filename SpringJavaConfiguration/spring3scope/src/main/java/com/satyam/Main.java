package com.satyam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Insane obj1 = context.getBean(Insane.class);
            obj1.runInsane();
            Insane obj2 = context.getBean(Insane.class);
            obj2.runInsane();
        }
    }
}