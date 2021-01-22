package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.model.Hospital;

@SpringBootApplication
public class Oauth2SocialLoginGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2SocialLoginGithubApplication.class, args);
	}

	@Bean
	public Hospital fortis() {
		
		return new Hospital(1010, "Malar Fortis", 980000100);
	}
	
	
	@Bean
	public Hospital sahayadri() {
		
		return new Hospital(2020, "Sahayadri", 780000100);
	}
	
	@Bean
	public PasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
}
