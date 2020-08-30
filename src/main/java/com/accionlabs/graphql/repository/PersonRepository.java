package com.accionlabs.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accionlabs.graphql.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	
}
	