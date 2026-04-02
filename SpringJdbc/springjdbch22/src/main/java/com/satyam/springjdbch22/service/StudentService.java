package com.satyam.springjdbch22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyam.springjdbch22.model.Student;
import com.satyam.springjdbch22.repository.StudentRepo;
import java.util.*;
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
    repo.save(s1);
  }
  
  public List<Student> getStudents() {
    return repo.findAll();// findAll() is a method of JPA.
  }
}
