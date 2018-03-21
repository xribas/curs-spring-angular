package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Component(value="helloWorld")
public class HelloWorld {

	@Getter
	@Setter
	private String hello;

	@Autowired
	public HelloWorld(@Value("Hello World From Annotations!") String hello) {
		this.hello = hello;
	}
}
