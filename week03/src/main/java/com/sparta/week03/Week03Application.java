package com.sparta.week03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //생성시간, 수정시간을 자동으로 Update 해준다.
@SpringBootApplication
public class Week03Application {

	public static void main(String[] args) {
		SpringApplication.run(Week03Application.class, args);
	}

}
