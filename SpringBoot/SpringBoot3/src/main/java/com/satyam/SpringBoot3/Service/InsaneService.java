package com.satyam.SpringBoot3.Service;

import org.springframework.stereotype.Service;

import com.satyam.SpringBoot3.Model.Insane;

@Service
public class InsaneService {
  public void addInsane(Insane insane) {
    System.out.println(insane.getNum1()+insane.getNum2());
  }
}
