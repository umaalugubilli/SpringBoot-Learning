package com.learningspring.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		
		System.out.println(context.getBean("person1"));

	}

}
