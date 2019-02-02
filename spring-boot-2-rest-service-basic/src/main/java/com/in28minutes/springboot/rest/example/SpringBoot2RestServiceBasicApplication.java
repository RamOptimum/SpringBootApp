package com.in28minutes.springboot.rest.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.in28minutes.springboot.rest.example.student.StudentRepository;

@SpringBootApplication

public class SpringBoot2RestServiceBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2RestServiceBasicApplication.class, args);
	}

}
