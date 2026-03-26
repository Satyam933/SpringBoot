package com.satyam;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //Different instance shared everytime context.getBean() method called.
public class Insane {
  public Insane() {
    System.out.println("Insane Object Created !");
  }

  public void runInsane1() {
    System.out.println("Hello jii, I'M Object 1 !");
  }

  public void runInsane2() {
    System.out.println("Hello jii, I'M Object 2 !");
  }
}
