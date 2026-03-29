package com.satyam.SpringBoot3.Service;

import org.springframework.stereotype.Service;

import com.satyam.SpringBoot3.Model.Insane;

@Service
public class InsaneService {
  public void addInsane(Insane obj) {
    System.out.println(obj.getNum1()+obj.getNum2());
  }
}
