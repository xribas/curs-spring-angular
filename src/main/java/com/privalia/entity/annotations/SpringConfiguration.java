package com.privalia.entity.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class SpringConfiguration {
	
	@Bean(name = "propertyConfig")
	public static PropertySourcesPlaceholderConfigurer propertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name = "address")
	public Address address() {
		return new Address();
	}
	
	@Bean(name = "student")
	public Student student() {
		return new Student();
	}
}
