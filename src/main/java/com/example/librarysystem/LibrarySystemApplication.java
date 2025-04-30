package com.example.librarysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.librarysystem.repository")
public class LibrarySystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibrarySystemApplication.class, args);
	}

}
