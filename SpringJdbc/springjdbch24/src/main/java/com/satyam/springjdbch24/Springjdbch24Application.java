package com.satyam.springjdbch24;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.springjdbch24.model.Student;
import com.satyam.springjdbch24.service.StudentService;

@SpringBootApplication
public class Springjdbch24Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springjdbch24Application.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollnum(104);
		s1.setName("Satyam");
		s1.setMarks(98);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);
		List<Student> students = service.getStudents();
		for (Student st : students) {
			System.out.println(st);
		}
	}

}
