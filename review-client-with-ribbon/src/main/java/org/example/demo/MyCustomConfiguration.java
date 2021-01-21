package org.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MyCustomConfiguration {

	
	
	@Bean
	public IRule rule() {
		
		return new RoundRobinRule();
	}
}
