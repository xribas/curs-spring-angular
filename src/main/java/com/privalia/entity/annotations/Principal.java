package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.privalia.entity.annotations");
		context.refresh();
		Student student = (Student) context.getBean("student");
		System.out.println(student.toString());
		context.close();
	}
}
