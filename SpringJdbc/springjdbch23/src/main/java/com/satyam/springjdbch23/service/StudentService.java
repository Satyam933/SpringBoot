package com.satyam.springjdbch23.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyam.springjdbch23.model.Student;
import com.satyam.springjdbch23.repository.StudentRepo;

@Service
public class StudentService {
  private StudentRepo repo;

  public StudentRepo getRepo() {
    return repo;
  }
  @Autowired
  public void setRepo(StudentRepo repo) {
    this.repo = repo;
  }
  public void addStudent(Student s1) {
    //  System.out.println("Added !"); let's communicate with Repo class.
  repo.save(s1);
  }
}
