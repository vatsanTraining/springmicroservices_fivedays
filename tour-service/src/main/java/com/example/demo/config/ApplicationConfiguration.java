package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Tour;
import com.example.demo.model.TourAgent;

@Configuration
public class ApplicationConfiguration {

	
	@Bean
	public Tour lankaTour() {
		
		return new Tour(101,"Srilanka",45000);
	}
	
	@Bean
	public TourAgent agentRamesh() {
		
		return new TourAgent(1010, "Ramesh", 7488348, "kalewadi");
		
	}
}
