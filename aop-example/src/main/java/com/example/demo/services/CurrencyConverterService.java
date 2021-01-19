package com.example.demo.services;

import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Converter;

@Component
public class CurrencyConverterService implements Converter{

	@Override
	public double convert(double sourceValue) {
		
		return  sourceValue*65.00;
	}

	
	
}
