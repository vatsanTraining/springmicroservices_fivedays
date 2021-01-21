package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Image;

@SpringBootApplication
public class TourspotImageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourspotImageServiceApplication.class, args);
	}

	
	
	@Bean
	public Image  kashmir() {
		
		
		return new Image(101, "/images/kash01.jpg", "Dall Lake on full Moon","Lake" );
		
	}
	
	@Bean
	public Image simla() {
	
		return new Image(102, "/images/simla.jpg", "Sims Park","Park" );

	}
}
