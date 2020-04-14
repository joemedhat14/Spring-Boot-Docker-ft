package com.ft.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Docker5Application {
	@GetMapping
	public String tester() {
	return "Spring Boot Tester";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Docker5Application.class, args);
		System.out.println("Dockerized 5");
	}

}
