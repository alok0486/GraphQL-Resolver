package com.accionlabs.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accionlabs.graphql.model.Address;
import com.accionlabs.graphql.model.Person;
import com.accionlabs.graphql.repository.AddressRepository;
import com.accionlabs.graphql.repository.PersonRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class PersonService implements GraphQLQueryResolver
 {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Person getPersonById(Integer person_id){
        return personRepository.findById(person_id).get();
    }

    public List<Person> getAllPersons(){
       return personRepository.findAll();
    }

    public List<Address> getAllAddress(){
       return addressRepository.findAll();
    }
}
