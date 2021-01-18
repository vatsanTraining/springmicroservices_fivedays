package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class CustomerServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CustomerServiceApplication.class, args);
	
	
		 /*
		  *  AutoWire - Matching - One Bean - 1
		  *  AutoWire - Matching - More than One Bean -N
		  *  AutoWire - Matching - NO Bean -0
		  */
		
		  Customer ram = ctx.getBean(Customer.class);
		  
		  log.info(ram.toString());
	
	}

}
