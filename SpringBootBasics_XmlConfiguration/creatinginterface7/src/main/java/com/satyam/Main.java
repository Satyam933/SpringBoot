package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("creatingInterface7.xml")) {
            Insane obj = (Insane) context.getBean("insane");
            obj.runInsane();
        }
    }
}