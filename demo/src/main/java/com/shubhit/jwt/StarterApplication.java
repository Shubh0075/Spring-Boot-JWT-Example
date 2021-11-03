package com.shubhit.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shubhit.jwt"})
public class StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

}
