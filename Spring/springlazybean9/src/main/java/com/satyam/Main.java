package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springlazy.xml")) {
            Insane obj = (Insane) context.getBean("insane");
            obj.runInsane();
            context.getBean("moon"); //Just create Moon obj not storing it as we don't gona use it.
        }
    }
}