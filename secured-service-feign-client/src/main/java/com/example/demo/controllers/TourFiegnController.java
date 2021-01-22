package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clients.TourServiceClient;

@RestController
public class TourFiegnController {

	
	@Autowired
	private TourServiceClient client;
	
	
	
	@GetMapping(path = "/feign/tours")
	public String findAll() {
		
		return this.client.getAll();
	}
}
