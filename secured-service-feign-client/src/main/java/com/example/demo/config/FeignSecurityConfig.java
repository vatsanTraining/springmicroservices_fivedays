package com.example.demo.config;

import org.springframework.context.annotation.Bean;

import feign.auth.BasicAuthRequestInterceptor;

public class FeignSecurityConfig {

	
	

@Bean
public BasicAuthRequestInterceptor interceptor() {

return new BasicAuthRequestInterceptor("guest", "guest");

  }

}
