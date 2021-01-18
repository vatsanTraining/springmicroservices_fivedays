package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Address;
import com.example.demo.model.Customer;

@Configuration
public class ApplicationConfig {

	
	
	
	@Bean
	public Address ramsAddress() {
		
		return new Address("Gandhi Street", "nehru nagar", "chennai", 600117);
	}
	
	
	@Bean
	public Customer ram() {
		
		Customer ram = new Customer();
		
		 ram.setId(10203);
		 ram.setCustomerName("Ram Kumar");
		 ram.setEmail("ram@abc.com");
		 
		 return ram;
	}
}
