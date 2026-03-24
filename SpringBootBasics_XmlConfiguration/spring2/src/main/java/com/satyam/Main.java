package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");//obbject creation happens here according to the <bean> tag inside spring2.xml
        context.close(); //for closing context, we can also use try block.
    }
}