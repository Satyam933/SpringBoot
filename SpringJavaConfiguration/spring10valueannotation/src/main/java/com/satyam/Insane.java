package com.satyam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insane {
  @Value("23") //Injecting 23 in num.
  private int num;

  public int runInsane() {
    return num;
  }
}
