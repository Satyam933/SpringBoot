package com.satyam.SpringBoot4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.SpringBoot4.Model.Insane;
import com.satyam.SpringBoot4.Repository.InsaneRepository;

@SpringBootApplication
public class SpringBoot4Application {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringBoot4Application.class, args);
	Insane insane = context.getBean(Insane.class);
	InsaneRepository repository = context.getBean(InsaneRepository.class);
	repository.addInsane(insane);
	}
}
