package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SpringMvcRestTemplateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestTemplateDemoApplication.class, args);
	}
	
	@Bean
	ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

}
