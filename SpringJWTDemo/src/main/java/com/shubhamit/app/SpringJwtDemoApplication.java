package com.shubhamit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shubhamit"})
public class SpringJwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtDemoApplication.class, args);
	}

}
