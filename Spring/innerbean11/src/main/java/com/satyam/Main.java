package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("innerbean.xml")) {
            Insane obj = context.getBean(Insane.class);
            obj.runInsane();

            // Coder coder = context.getBean(Coder.class);  fails because bean of coder is inside Insane bean.
        }
    }
}