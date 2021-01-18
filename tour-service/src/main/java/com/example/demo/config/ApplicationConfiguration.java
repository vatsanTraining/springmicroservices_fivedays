package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Tour;
import com.example.demo.model.TourAgent;
import com.example.demo.model.TourCatalog;

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
	
	// Passing the Reference of Beans
	
	@Bean
	public TourCatalog europeTour() {
		
		return new TourCatalog(lankaTour(),agentRamesh());
	}
	
	@Bean
	public TourCatalog eastAsiaTour(@Qualifier("thailandTour") Tour tour, @Qualifier("agentManish")  TourAgent agent) {
		
		
		return new TourCatalog(tour,agent);
	}
}
