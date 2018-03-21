package com.privalia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Address {

	@Getter @Setter private int id;
	@Getter @Setter private String street;
	
}
