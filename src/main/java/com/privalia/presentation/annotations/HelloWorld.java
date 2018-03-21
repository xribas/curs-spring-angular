package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
 * @Repository - Used to mark a bean as DAO Component on persistence layer
 * @Service - Used to mark a bean as Service Component on business layer
 * @RestController - Used to mark a bean as RestController Component on Web Service Layer
 * @Controller - USed to mark a bean as Controller Component on Presentation Layer
 * @Configuration - Used to mark a bean as Configuration Compoment
 * @Component - General purpose annotation, can be used as a replacement for above annotations
 */

@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {

	@Autowired
	@Value("Hello World From Annotations!")
	@Getter
	@Setter
	private String hello;

}
