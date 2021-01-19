package com.example.demo.advices;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;

@Aspect
@EnableAspectJAutoProxy
@Configuration
@Slf4j
public class MyAdvices {

	
	//pointcut and advices
	@Before(value = "execution(* com.example.demo.services.*.*(..))")
	public void loggingAdvice(JoinPoint jp) {
		
		
		log.info(jp.getSignature().getName()+LocalDateTime.now());
		
	}
	
	
	//pointcut and advices
	@Around(value = "execution(* com.example.demo.services.CurrencyConverterService.*(..))")
	public Double offerAdvice(ProceedingJoinPoint pjp) throws Throwable{
		
		
		Object[] args =pjp.getArgs();
		
		log.info("Currency value to Convert:= "+args[0] );
		
		
		 Object value = pjp.proceed();
		 
		  Double updatedValue = (Double)value;
		  
		   return updatedValue+99;
		
	}
}
