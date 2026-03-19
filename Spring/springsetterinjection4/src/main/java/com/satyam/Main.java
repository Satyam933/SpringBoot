package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springsetter.xml")) {
            Insane obj = (Insane) context.getBean("insane");
            System.out.println(obj.getNum());
        } 
    }
}