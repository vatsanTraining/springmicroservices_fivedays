package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@ToString
//@Component
public class TourCatalog {

	

	Tour tour;
	 TourAgent agent;
	 
	 // Constructor DI
	 
	
	//@Autowired
	public TourCatalog(Tour tour, TourAgent agent) {
		super();
		this.tour = tour;
		this.agent = agent;
	}
	 

	
   //  @Autowired
	 public void setTour(Tour tour) {
		this.tour = tour;
	}

     //@Autowired
	public void setAgent(TourAgent agent) {
		this.agent = agent;
	}

}
