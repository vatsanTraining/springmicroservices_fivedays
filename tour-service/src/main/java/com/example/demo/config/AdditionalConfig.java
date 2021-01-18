package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Tour;
import com.example.demo.model.TourAgent;

@Configuration
public class AdditionalConfig {

	
	@Bean
	public Tour thailandTour() {
		
		return new Tour(102,"Thailand",75000);
	}
	
	@Bean
	public TourAgent agentManish() {
		
		return new TourAgent(2020, "Manish", 7466348, "Marathalli");
		
	}
}
