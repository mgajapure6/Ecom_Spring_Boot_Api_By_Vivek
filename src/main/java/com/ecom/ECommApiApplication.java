package com.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ecom")
@SpringBootApplication
public class ECommApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommApiApplication.class, args);
	}
}
