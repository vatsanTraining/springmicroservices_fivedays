package com.example.demo;

import org.example.demo.MyCustomConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "review-service",configuration = MyCustomConfiguration.class)
public class ReviewClientWithRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewClientWithRibbonApplication.class, args);
	}

}
