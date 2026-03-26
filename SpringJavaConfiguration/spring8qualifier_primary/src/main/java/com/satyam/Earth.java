package com.satyam;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //We can specify bean name as @Component("EarthBean"),  but we have to use same when we are searching for it.
@Primary //We can make any class for default as primary for execution when ambiguity occurs.
public class Earth implements Coder{
  @Override
  public void runCoder() {
    System.out.println("I'M Insane Coder form Earth !");
  }
}
