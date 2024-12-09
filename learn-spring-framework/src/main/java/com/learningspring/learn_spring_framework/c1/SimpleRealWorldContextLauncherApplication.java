package com.learningspring.learn_spring_framework.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleRealWorldContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext(SimpleRealWorldContextLauncherApplication.class)){
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
		
		

	}

}
