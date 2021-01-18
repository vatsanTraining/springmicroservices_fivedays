/*
 * All those classes with @Component Annotation present in com.example.demo or its sub packages will 
 * be auto scanned and registered as bean
 */
package com.example.demo;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.config.AdditionalConfig;
import com.example.demo.model.Tour;
import com.example.demo.model.TourCatalog;


//@SpringBootApplication(exclude = BatchAutoConfiguration.class)
@SpringBootApplication
public class TourServiceApplication {

	public static void main(String[] args) {
		/**
		 * The First Argument is a Class annotated with @SpringBootApplication , in this the TourServiceApplication
		 * itself has @SpringBootApplication hence its passed as a argument
		 * i.e any Class annotated with @SpringBootApplication can be passed as an argument
		 * 
		 * The Second Argument is command Line arguments passed to the main method
		 * 
		 * The return type of run method is a IoC container
		 * 
		 */
		
	//	ConfigurableApplicationContext ctx=  SpringApplication.run(ApplicationConfiguration.class, args);
		
		ConfigurableApplicationContext ctx=  SpringApplication.run(TourServiceApplication.class, args);
		
		
		       Map<String, TourCatalog> beanList   =  ctx.getBeansOfType(TourCatalog.class);
		            
		                    Set<Map.Entry<String,TourCatalog>> list =         beanList.entrySet();
		                    
		                     for(Map.Entry<String,TourCatalog> eachItem :list){
		                    	 
		                    	 System.out.println(eachItem.getKey()  +"=:=" +  eachItem.getValue());
		                    	 
		                    	 
		                     }
		            
//		ConfigurableApplicationContext ctx=  new SpringApplicationBuilder(TourServiceApplication.class)
//				     .properties("spring.main.allow-bean-definition-overriding:true").build().run(args);
//		
		
		// getBean Method uses the id of the Bean which is firstCharacter the java class with @Component in lower case
		
//		  Tour tour = (Tour)ctx.getBean("tour");
//		  
//		  System.out.println(tour);
//		  
		  
		  // getBean Method uses the id of the Bean which is the Method Name annotated with @Bean 
		  
          Tour lankaTour = (Tour)ctx.getBean("lankaTour");
		  
		  System.out.println(lankaTour);
		  
		  
		  // getBean Method with the name of the class as argument may throw NoUniqueBeanFoundException if 
		  // more than one Bean of the same type is found
		  
		  // Tour tour2 = ctx.getBean(Tour.class);

		  
		  // getBean Method with beanId and class if more than one bean of the same type is available
		  
//		  Tour tour2 = ctx.getBean("tour",Tour.class);
//		  
//		  System.out.println(tour2);
//		
		System.out.println(ctx.getClass().getName());
		
		
		TourCatalog euroCatalog = ctx.getBean("europeTour",TourCatalog.class);
		
		System.out.println(euroCatalog);
		
		
       TourCatalog asiaCatalog = ctx.getBean("eastAsiaTour",TourCatalog.class);
		
		System.out.println(asiaCatalog);
		
		
	}

	
	
}
