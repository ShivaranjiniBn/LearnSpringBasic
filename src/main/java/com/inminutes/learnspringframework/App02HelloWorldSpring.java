package com.inminutes.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.inminutes.learnspringframework.helloworld.HelloworldConfiguration;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try (//Launch a spring context
	var context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class)) {
		//configure the things that we want spring to manage - @configuration 
	System.out.println(context.getBean("name"));
	System.out.println(context.getBean("age"));
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("person2MethodCall"));
	System.out.println(context.getBean("person3Parametersl"));
	System.out.println(context.getBean("add2"));
	//System.out.println(context.getBean(Address.class));//using Type 
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
