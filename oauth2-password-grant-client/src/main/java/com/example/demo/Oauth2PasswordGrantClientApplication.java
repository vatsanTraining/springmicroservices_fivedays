package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

import com.nimbusds.oauth2.sdk.ClientCredentialsGrant;

@SpringBootApplication
public class Oauth2PasswordGrantClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(Oauth2PasswordGrantClientApplication.class, args);
		
//		OAuth2RestTemplate template = ctx.getBean(OAuth2RestTemplate.class);
//		
//		  String response =template.getForObject("http://localhost:8080/hospitals/3",String.class );
//		  
//		  
//		  System.out.println("RESPONSE:="+ response);
		  
		  
		  
		  OAuth2RestTemplate template = ctx.getBean("template2",OAuth2RestTemplate.class);
			
		  String response =template.getForObject("http://localhost:3030/hospitals/3",String.class );
		  
		  
		  System.out.println("RESPONSE:="+ response);
	}

	
	@Bean
	public OAuth2RestTemplate template() {
		
		
		ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();


	     details.setAccessTokenUri("http://localhost:8080/oauth/token");
	    
	details.setClientId("ourclient");
	details.setClientSecret("pass123");
	details.setUsername("india");
	details.setPassword("india");
	details.setGrantType("password");
	 
	       OAuth2RestTemplate template = new OAuth2RestTemplate(details);
	           return template;

	}
	

	@Bean
	@Primary
	public OAuth2RestTemplate template2() {
		
		
		ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();

		

	     details.setAccessTokenUri("http://localhost:3030/oauth/token");
	    
	details.setClientId("ourclient");
	details.setClientSecret("pass123");
	
	details.setGrantType("client_credentials");
	 
	       OAuth2RestTemplate template = new OAuth2RestTemplate(details);
	           return template;

	}

}
