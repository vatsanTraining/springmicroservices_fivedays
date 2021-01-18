package com.example.demo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Customer {

	
	public Customer(int id, String customerName, String email) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
	}

	public Customer() {
		super();

		//System.out.println("Environment-PORT  :="+ env.getProperty("server.port"));
	}

	@Autowired
	private Environment env;
	
	private int id;
	private String customerName;
	private String email;
	
	@Autowired(required = false)
	@Qualifier("ramsAddress2")
	private Address billingAddress;
	
	
	@PostConstruct
	public void init() {

		System.out.println("Environment-PORT  :="+ env.getProperty("server.port"));

		
	}
	

	@PreDestroy
	public void destroy() {

		System.out.println("DESTROY METHOD Called --------------");

		
	}

}
