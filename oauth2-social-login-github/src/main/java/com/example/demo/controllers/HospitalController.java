package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hospital;

@RestController
public class HospitalController {

	
	@Autowired
	@Qualifier("fortis")
	private Hospital fortis;
	
	@Autowired
	@Qualifier("sahayadri")
	private  Hospital sahya;
	
	
	@GetMapping(path = "/hospitals/{id}")
	public Hospital getHospitalById(@PathVariable("id") int id) {
		
		
		if(id<5) {
			return this.fortis;
		} else {
			return this.sahya;
		}
		
		
	}
}
