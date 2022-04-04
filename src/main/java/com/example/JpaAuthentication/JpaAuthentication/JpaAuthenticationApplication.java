package com.example.JpaAuthentication.JpaAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackageClasses=JpaRepo.class)
@SpringBootApplication
public class JpaAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuthenticationApplication.class, args);
	}

}
