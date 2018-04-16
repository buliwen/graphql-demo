package com.example.demo.schema;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	
	public String getString() {
		return "helloWorld!";
	}
	
}
