package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CallingSecuredService {

	
	
	private RestTemplate securedTemplate;

	@Autowired
	public void setTemplate(@Qualifier("securedTemplate") RestTemplate template) {
		this.securedTemplate = template;
	}
	
	
	
	@GetMapping(path = "/api/v1/client/tours")
	public String getTours() {
		
 
		 
		 String baseURL = "http://localhost:6060/api/v1/tours/";
		 
		 String response = this.securedTemplate.getForObject(baseURL, String.class);
		 
		return response;
	}
	

}
