package com.example.demo.services;

import com.example.demo.ifaces.Converter;

public class CurrencyConverterService implements Converter{

	@Override
	public double convert(double sourceValue) {
		
		return  sourceValue*65.00;
	}

	
	
}
