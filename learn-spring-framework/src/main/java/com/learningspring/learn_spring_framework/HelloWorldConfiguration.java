package com.learningspring.learn_spring_framework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String street, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Mahesh";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person(String name, int age) {
		var person = new Person("Uma",23,address());
		
		return person;
	}
	
	@Bean
	public Address address() {
		return new Address("Madhuranagar", "Vijayawada");
	}
	
	@Bean
	public Person person1(String name, int age) {
		return new Person(name, age,address());
	}
}
