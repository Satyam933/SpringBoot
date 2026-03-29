package com.satyam.SpringBoot3.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insane {
  @Value("39")
  private int num1;
  @Value("30")
  private int num2;

  public int getNum1() {
    return num1;
  }

  public int getNum2() {
    return num2;
  }
}
