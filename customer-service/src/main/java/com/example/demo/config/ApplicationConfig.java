package com.example.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Address;
import com.example.demo.model.Customer;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ApplicationConfig {

	
	
	
	@Bean
	@Primary
	@Lazy(value = true)
	public Address ramsAddress1() {
		
		log.info("Calling Factory Method ramAddress1() ##########");

		return new Address("Gandhi Street", "nehru nagar", "chennai", 600117);
	}
	
	
	@Bean
	@Lazy(value = true)
	public Address ramsAddress2() {
		
		log.info("Calling Factory Method ramAddress2() ******");

		return new Address("Shivaji Street", "Secor 202", "kalyani", 400117);
	}
	
	
	//@Bean(initMethod = "init")
	//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	//@Lazy(value = true)
	@Bean
	public Customer ram() {
		
		log.info("Calling Factory Method ram() =========");
		Customer ram = new Customer();
		
		 ram.setId(10203);
		 ram.setCustomerName("Ram Kumar");
		 ram.setEmail("ram@abc.com");
		 
		 return ram;
	}
	
	@Bean
	@Profile(value = "dev")
	public Customer shyam() {
		
		return new Customer(2030,"Shyam","shyam@abc.com");
	}
	
	
	@Bean
	@Profile(value = "prod")
	public Customer manish() {
		
		return new Customer(3030,"Manish","mani@abc.com");
	}
}
