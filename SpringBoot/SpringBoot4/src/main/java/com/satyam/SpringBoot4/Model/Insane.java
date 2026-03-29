package com.satyam.SpringBoot4.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.satyam.SpringBoot4.Repository.InsaneRepository;

@Component
public class Insane {
  @Autowired
  private InsaneRepository repository;

  public InsaneRepository getRepository() {
    return repository;
  }
}
