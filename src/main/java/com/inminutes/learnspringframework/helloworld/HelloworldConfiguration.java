package com.inminutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age , Address address) {
	
}

record Address( String city, String state) {
	
}

@Configuration
public class HelloworldConfiguration {
	@Bean
	public String name() {
		return "Ranju";
	}
	
	@Bean
	public int age() {
		return 24;
	}

	@Bean
	public Person person() {
		return new Person("Ranjini", 23 , new Address("bangalore", "bakery"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age() , address()); //name , age
		
	}
	
	@Bean
	public Person person3Parametersl(String name, int age, Address address) {
		return new Person(name,age , address); //name , age
		
	}
	
	@Bean(name = "add2")
	public Address address() {
		return new Address("mulbagal", "Kolar");
	}
}
