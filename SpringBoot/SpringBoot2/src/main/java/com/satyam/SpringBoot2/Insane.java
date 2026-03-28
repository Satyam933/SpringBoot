package com.satyam.SpringBoot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insane {
  @Value("100")
  private int num;
  private Coder code;
  
  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public Coder getCoder() {
    return code;
  }

  @Autowired
  @Qualifier("moon")
  public void setCode(Coder code) {
    this.code = code;
  }

  public void runInsane() {
    code.runCoder();
  }
}
