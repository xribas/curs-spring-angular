package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component(value="address")
public class Address {
	
	@Autowired
	@Value("1")
	@Getter
	@Setter
	private int id;
	
	@Autowired
	@Value("Calle San Juan")
	@Getter 
	@Setter
	private String street;
	
}
