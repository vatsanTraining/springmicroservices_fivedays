package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TourRestApiClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(TourRestApiClientApplication.class, args);
		
//		
//		 RestTemplate template = ctx.getBean(RestTemplate.class);
//		 
//		 String baseURL = "http://localhost:5858/api/v1/tours/";
//		 
//		 String response = template.getForObject(baseURL, String.class);
//		 
//		 System.out.println(response);
		
	}

	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
