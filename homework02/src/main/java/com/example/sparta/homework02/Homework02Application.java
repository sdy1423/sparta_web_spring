package com.example.sparta.homework02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //Spring에서 JPA를 자유롭게 쓸 수 있도록
@SpringBootApplication
public class Homework02Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework02Application.class, args);
	}

}
