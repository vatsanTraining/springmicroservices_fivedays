package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("india").password("{noop}india").and().withUser("ADMIN");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

	
		http.authorizeRequests().antMatchers("/api/v1/tours/**")
		      .authenticated().and().formLogin().and().logout().logoutSuccessUrl("/api/v1/tours/")
		       .invalidateHttpSession(true).deleteCookies("JSESSIONID");
		
	
	}

	
	
}
