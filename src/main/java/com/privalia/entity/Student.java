package com.privalia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

	@Getter @Setter private int idStudent;
	@Getter @Setter private String name;
	@Getter @Setter private String surname;
	@Getter @Setter private int age;
	@Getter @Setter private Address address;
	
}
