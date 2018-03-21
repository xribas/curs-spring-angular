package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Configuration
@PropertySource("classpath:config.properties")
public class Student {

	@Autowired
	@Value("${student.idstudent}")
	@Getter @Setter private int idStudent;
	@Autowired
	@Value("${student.name}")
	@Getter @Setter	private String name;
	
	@Autowired
	@Value("${student.surname}")
	@Getter	@Setter	private String surname;
	
	@Autowired
	@Value("${student.age}")
	@Getter	@Setter	private int age;

	@Autowired
	@Getter
	@Setter
	private Address address;
	
}
