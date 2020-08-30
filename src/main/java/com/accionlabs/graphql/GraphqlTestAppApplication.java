package com.accionlabs.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

@SpringBootApplication
public class GraphqlTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlTestAppApplication.class, args);
	}

}
