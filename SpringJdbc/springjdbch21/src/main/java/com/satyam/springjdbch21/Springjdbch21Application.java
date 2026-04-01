package com.satyam.springjdbch21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.springjdbch21.model.Student;

@SpringBootApplication
public class Springjdbch21Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springjdbch21Application.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollNum(101);
		s1.setName("Satyam");
		s1.setMarks(82);
		//addStudent(s1); this will in service layer and then service layer connect with repo layer and repo is responsible to do operations with database.
	}
}
