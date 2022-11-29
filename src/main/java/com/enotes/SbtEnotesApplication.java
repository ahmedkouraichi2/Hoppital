package com.enotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SbtEnotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtEnotesApplication.class, args);
	}

}
