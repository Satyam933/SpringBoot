package com.satyam;

//import java.beans.ConstructorProperties;

public class Insane {
  String sum;
  int num1;
  float num2;

  //@ConstructorProperties({"sum", "num1", "num2"}) 
  
  public Insane(String sum, int num1, float num2) {
    this.sum = sum;
    this.num1 = num1;
    this.num2 = num2;
  }

  public void run() {
    System.out.println(sum +"= "+ (num1 + num2));
  }
}
