package com.adonayg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);
		
		HelloWorldService helloWorld = (HelloWorldService) ctx.getBean("helloWorldImpl");
		helloWorld.sayHello();
		
		//Constructor Injection
		InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
		constructorService.getMessage();
		
		//Setter Injection
		SetterBasedService setterService = (SetterBasedService) ctx.getBean("setterBasedService");
		setterService.getMessage();
	}

}
