package com.privalia.entity.annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Principal {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student student = context.getBean(Student.class);
		System.out.println(student.toString());
		context.close();
	}
}
