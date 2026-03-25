package com.beanname;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Insane obj = context.getBean("beanName", Insane.class);
            obj.runInsane();
        }
    }
}