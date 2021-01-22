package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Image;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ImageController {

	
	@Autowired
	@Qualifier("kashmir")
	Image  kashmir;
	
	@Autowired
	@Qualifier("simla")
	Image simla;
	
	
	
	@GetMapping(path = "/images/{id}")
	public Image getImage(@PathVariable("id") int id)  throws InterruptedException,Exception{
		
		log.info("Get Image Called");
		if(id==2) {
			
			log.error(" Invalid Value");
			throw new Exception("Exception");
			
			
		}
		if(id<10) {
			
			return this.kashmir;
		} else {
			
			Thread.sleep(6000);
			
			return this.simla;
		}
		
	}
	
	@GetMapping(path = "/images/message/{id}")
	public String getInfo(@PathVariable("id") int id) throws Exception {
		log.info("Get Info Called");
		if(id==2) {
			
			return "Hello From Image Controller";
		} else {
			
			throw new Exception("Invalid Choice");
		}
		
	}
}
