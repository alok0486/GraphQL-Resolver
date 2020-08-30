package com.accionlabs.graphql.service;

import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accionlabs.graphql.model.Address;
import com.accionlabs.graphql.model.Person;
import com.accionlabs.graphql.repository.AddressRepository;
import com.accionlabs.graphql.repository.PersonRepository;

@Service
public class DataLoaderService {

	@Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;
    
    @PostConstruct
    public void loadData(){
    	System.out.println("INNNNNNNN");
    	Stream.of(
				  new Address(1,"1", "Ranchi", "834001"),
				  new Address(2,"2", "Pune", "410081"),
				  new Address(3,"3","Banglore","560031")
	        ).forEach(address -> {
	        	addressRepository.save(address);
	        });

    	Stream.of(
				  new Person(1, "Alok", "alok.ranjan@accionlabs.com",1,"Sepetember 2017"),
				  new Person(2, "Ranjan", "ranjan@accionlabs.com",2, "June 2019"),
				  new Person(3, "Alok Ranjan", "ar_alok@accionlabs.com",3, "Jan 2012")
	        ).forEach(person -> {
	        	personRepository.save(person);
	        });
    }
}
