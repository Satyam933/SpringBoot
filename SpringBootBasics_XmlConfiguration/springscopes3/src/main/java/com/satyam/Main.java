package com.satyam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springscope3.xml")) {
            Insane obj1 = (Insane) context.getBean("insane");
            obj1.num=10;
            System.out.println(obj1.num);

            Insane obj2 = (Insane) context.getBean("insane");
            System.out.println(obj2.num);//Initial value prints as obj2 is a different object because we use prototype scope in <bean> tag.

            Insane obj3 = (Insane) context.getBean("insane");
            obj3.num = 30;
            System.out.println(obj3.num);
        }
    }
}