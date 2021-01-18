package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	
	private int id;
	private String customerName;
	private String email;
	
	@Autowired(required = false)
	@Qualifier("ramsAddress2")
	private Address billingAddress;
	
}
