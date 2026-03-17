package com.satyam.second2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//insane obj = new insane(); run but we want spring provide us object we don't want to create.
		//obj.code();
	}

}
