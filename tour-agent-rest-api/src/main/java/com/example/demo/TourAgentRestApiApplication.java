package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TourAgent;
import com.example.demo.repos.TourAgentRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class TourAgentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourAgentRestApiApplication.class, args);
	}

	
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			TourAgentRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
			
				
				repo.save(new TourAgent(101,"Suabsh",9494949,"mumbai"));
				repo.save(new TourAgent(102,"Sarkar",8494949,"nasik"));
				
				
			}
		};
		
	}
}
