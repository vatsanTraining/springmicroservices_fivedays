package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tour;
import com.example.demo.services.TourService;

@RestController
@RequestMapping(path = "/api/v1/tours")
public class TourController {

	
	
	private TourService service;
	
	
	@Autowired
	public void setTourService(TourService service) {
		
		 this.service = service;
	}
	
	@GetMapping(path = "/")
	public List<Tour>  findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Tour  findById(@PathVariable("id") int id){
		
		return  this.service.findById(id).orElseThrow(()->new RuntimeException("Given Id Not Found"));
	}

	
	@PostMapping(path = "/")
	public ResponseEntity<Tour> addTour(@RequestBody Tour tour) {
		
		
		 return ResponseEntity.status(HttpStatus.CREATED).body(this.service.addTour(tour));
					
	}
	
	@PutMapping(path = "/")
	public Tour updateTour(@RequestBody Tour entity) {
		
		return this.service.updateTour(entity);
	}
	
	@DeleteMapping(path = "/")
	public Tour removeTour(@RequestBody Tour entity){
		
		return this.service.removeTour(entity).orElseThrow(()-> new RuntimeException("Element NOT FOUND"));
		
	}
	
	
	@GetMapping(path = "/update")
	public ResponseEntity<String> updateCost() {
		
		
		 return ResponseEntity.status(HttpStatus.CREATED).body("Updated tours:="+this.service.updateCost());
					
	}
	
}
