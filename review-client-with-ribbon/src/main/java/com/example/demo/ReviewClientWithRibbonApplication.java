package com.example.demo;

import org.example.demo.MyCustomConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name = "review-service",configuration = MyCustomConfiguration.class)
public class ReviewClientWithRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewClientWithRibbonApplication.class, args);
	}

	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
