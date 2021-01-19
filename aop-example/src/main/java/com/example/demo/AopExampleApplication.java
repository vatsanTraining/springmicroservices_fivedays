package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.ifaces.Converter;

@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(AopExampleApplication.class, args);
	
		
		 Converter currencyConverter = ctx.getBean("currencyConverterService",Converter.class);
		 
		 
		    System.out.println(currencyConverter.getClass().getName());
		    
		    
		    System.out.println("Currency Converter:=" +currencyConverter.convert(100));
		 
		
		    Converter tempConverter = ctx.getBean("temparatureConverter",Converter.class);
			 
		    System.out.println("Temprature Converter:="+ tempConverter.convert(56));
			
	
	}

}
