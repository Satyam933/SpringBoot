package com.satyam.SpringBoot4.Repository;

import org.springframework.stereotype.Repository;

import com.satyam.SpringBoot4.Model.Insane;

@Repository
public class InsaneRepository {
  public void addInsane(Insane insane) {
    System.out.println("Connected to Database !");
  }
}