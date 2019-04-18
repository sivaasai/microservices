package com.rsp.LearnTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rsp")
public class LearnTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnTestingApplication.class, args);
	}

}
