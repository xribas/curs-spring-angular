package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	
	public static void main(String[] args) {
		
		// 1. Fitxer configuració spring (setter injectio)
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		// 2. Obtenir instància de l'objecte injectat
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		
		// 3. Usar la instància per fer quelcom
		System.out.println(helloWorld.getHello());
		
		
		HelloWorld helloWorldConst = (HelloWorld) context.getBean("helloWorldConst");
		System.out.println(helloWorldConst.getHello());
		
		// 4. Tancar el contexte
		context.close();
	}

}
