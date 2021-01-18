package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Component
public class TourCatalog {

	
	 Tour tour;
	 TourAgent agent;
	 
	 // Constructor DI
	 
	 @Autowired
	public TourCatalog(Tour tour, TourAgent agent) {
		super();
		this.tour = tour;
		this.agent = agent;
	}
	 
	 
}
