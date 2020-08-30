package com.accionlabs.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accionlabs.graphql.model.Address;
import com.accionlabs.graphql.model.Person;
import com.accionlabs.graphql.repository.AddressRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class AddressResolver implements GraphQLResolver<Person> {

    @Autowired
    private AddressRepository repository;


    public Address getAddress(Person person){
        return repository.findById(person.getAddressId()).get();
    }
}
