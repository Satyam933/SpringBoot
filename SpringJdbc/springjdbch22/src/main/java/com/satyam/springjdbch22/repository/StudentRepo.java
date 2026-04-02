package com.satyam.springjdbch22.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.satyam.springjdbch22.model.Student;

@Repository
public class StudentRepo {
  public void save(Student s1) {
    System.out.println("Saved");
  }

  public List<Student> findAll() {
    List<Student> students = new ArrayList<>();// As we don't use database, so let's try to print dummy data.
    return students;
  }
}
