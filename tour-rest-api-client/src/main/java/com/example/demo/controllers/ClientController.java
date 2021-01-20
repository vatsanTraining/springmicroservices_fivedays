package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
    @Autowired
    @Qualifier("lbtemplate")
	private RestTemplate lbtemplate;

	
    
	
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
	

	@GetMapping(path = "/api/v1/lbclient/tours")
	public String getAllTours() {
		
 
		 
		 
		 String baseURL = "http://TOUR-SERVICE/api/v1/tours/";
		 
		 
		 String response = this.template.getForObject(baseURL, String.class);
		 
		return response ;
	}
	

	
	
	
}
