package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
	private RestTemplate template;

	@Autowired
	public void setTemplate(RestTemplate template) {
		this.template = template;
	}
	
	@GetMapping(path = "/api/v1/client/tours")
	public String getTours() {
		
 
		 
		 String baseURL = "http://localhost:5858/api/v1/tours/";
		 
		 String response = this.template.getForObject(baseURL, String.class);
		 
		return response;
	}
	
	
	
}
