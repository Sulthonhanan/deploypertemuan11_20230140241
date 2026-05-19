package com.example.pertemuan11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.pertemuan11.repository")
@EntityScan("com.example.pertemuan11.model")
public class Pertemuan11Application {
	public static void main(String[] args) {
		SpringApplication.run(Pertemuan11Application.class, args);
	}
}
