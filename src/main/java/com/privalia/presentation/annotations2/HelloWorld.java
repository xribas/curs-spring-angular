package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Component(value="helloWorld")
public class HelloWorld {

	@Autowired
	@Value("Hello World From Annotations!")
	@Getter
	@Setter
	private String hello;

}
