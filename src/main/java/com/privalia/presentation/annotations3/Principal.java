package com.privalia.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.presentation.annotations3");
		annotationContext.refresh();
		
		HelloWorld helloWorld = annotationContext.getBean(HelloWorld.class);
		System.out.println(helloWorld.getHello());
	
		annotationContext.close();
	}

}
