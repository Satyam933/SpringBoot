package com.satyam.springjdbch22.service;

import org.springframework.stereotype.Service;

import com.satyam.springjdbch22.model.Student;

@Service
public class StudentService {
  public void addStudent(Student s1) {
    System.out.println("Added !");
  }
}
