package com.example.demo.condtional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class TourAgentConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		String name = context.getEnvironment().getProperty("spring.application.name");
		
		System.out.println("Name :=============="+name);
		if(name.equals("tour-dev")) {
		return false;
		} else {
			return true;
		}
	}

}
