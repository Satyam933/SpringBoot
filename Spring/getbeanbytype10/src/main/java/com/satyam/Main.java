package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("getbeanbytype.xml")) {
            Insane obj = context.getBean(Insane.class);
            obj.run();
        }
    }
}