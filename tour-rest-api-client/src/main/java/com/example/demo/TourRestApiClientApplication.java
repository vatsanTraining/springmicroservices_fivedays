package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class TourRestApiClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(TourRestApiClientApplication.class, args);
		
//		
//		 RestTemplate template = ctx.getBean(RestTemplate.class);
//		 
//		 String baseURL = "http://localhost:5858/api/v1/tours/";
//		 
//		 String response = template.getForObject(baseURL, String.class);
//		 
//		 System.out.println(response);
		
	}

	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
	
	
	/*
	 * @ LoadBalanced 
	 * 
	 *  1. While using ServiceId with Rest Template
	 *  2. If more than one instance of the Service is registered with eureka it will fetch one of the instance 
	 *      and make the call 
	 */
	@Bean
	@LoadBalanced 
	public RestTemplate lbtemplate() {
		
		return new RestTemplate();
	}
	
	@Bean
	public RestTemplate securedTemplate() {
		
		RestTemplate template = new RestTemplate();
		
		template.getInterceptors().add(interceptor());

		return template;

		
		
	}
	
	@Bean
	public BasicAuthenticationInterceptor interceptor() {

	return new BasicAuthenticationInterceptor("guest", "guest");
	}

}
