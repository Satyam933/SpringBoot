package com.satyam;

public class Moon implements Coder {
  public Moon() {
    System.out.println("Moon obj created !");
  }
  @Override
  public void run() {
    System.out.println("Hii from Moon !");
  }
}
