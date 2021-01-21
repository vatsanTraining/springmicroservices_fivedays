package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Tour;
import com.example.demo.repos.TourRepository;

@SpringBootApplication
public class SecuredTourRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredTourRestApiApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			TourRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
			
				
				repo.save(new Tour(101,"simla",45000));
				repo.save(new Tour(102,"kodaikanal",8494949));
				
				
			}
		};
		
	}
}
