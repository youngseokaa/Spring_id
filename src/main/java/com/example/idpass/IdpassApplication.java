package com.example.idpass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IdpassApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdpassApplication.class, args);
	}

}
