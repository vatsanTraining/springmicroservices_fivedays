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
	
	
		 /*  Field Injection 
		  * 
		  *  AutoWire - Matching - One Bean - 1  => works fine
		  *  AutoWire - Matching - More than One Bean -N   - Exception
		  *     => solution -1  declaring one bean with @Bean and @Primary
		  *     => Solution -2  Declaring @Autowired with @Qaulifier("nameofBean")  
		  *     => If we have both @Primary and @Qualifier , @Qualifier will take the precedence
		  *  AutoWire - Matching - NO Bean -0   - Exception
		  *      => Throws Exception => Declare a Bean 
		  *      => Declare @Autowired(required=false) exception will not be thrown but need to do a null check
		  */
		
		
		/**
		 *  Eager Initialization => Default for All Singleton Beans 
		 *  Can Make it Lazy By adding @Lazy(value="true")
		 *  Lazy Initialization => Default for Prototype Beans
		 */
//		  Customer ram = ctx.getBean(Customer.class);
//		  
//		  log.info(ram.toString());
//		  
//		  
//		   boolean result =ctx.isSingleton("ram");
//		   
//		   System.out.println(" Is Customer Bean Singleton :="+ result);
//		   
//		   boolean result2 = ctx.isPrototype("ram");
//		   
//		   System.out.println(" Is Customer Bean Prototype :="+ result2);

		   
	
	}

}
