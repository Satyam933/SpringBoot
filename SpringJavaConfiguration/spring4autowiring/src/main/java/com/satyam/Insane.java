package com.satyam;

public class Insane {
    private Coder code;

    public Coder getCode() {
        return code;
    }

    public void setCode(Coder code) {
      this.code = code;
    }
    
  public Insane() {
    System.out.println("Insane Object Created !");
  }

  public void runInsane() {
    System.out.println("I'M Insane !");
    code.runCoder();
  }
}
