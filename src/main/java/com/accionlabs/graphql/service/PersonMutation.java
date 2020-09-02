package com.accionlabs.graphql.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.accionlabs.graphql.model.Address;
import com.accionlabs.graphql.model.Person;
import com.accionlabs.graphql.repository.AddressRepository;
import com.accionlabs.graphql.repository.PersonRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import javassist.NotFoundException;

public class PersonMutation implements GraphQLMutationResolver {

	@Autowired
	PersonRepository  personRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public Address createAddress(final String city , final String house_no, final String pin ) {
		 Address address = new Address();
		 address.setCity(city);
		 address.setHouse_no(house_no);
		 address.setPin(pin);
		 addressRepository.save(address);
		 return address;
	 }
	
	 public Person createPerson(final String name, final String email, final String dob, final Integer addressId) {
		 Person person = new Person();
		 person.setName(name);
		 person.setEmail(email);
		 person.setDob(dob);
		 person.setAddressId(addressId);
		 personRepository.save(person);
		return person;
	 }
	 
	 public boolean deleteAddress(Integer id) {
		 addressRepository.deleteById(id);
		return true;
	 }
	 
	 public boolean deleteErson(Integer id) {
		 personRepository.deleteById(id);
		return true;
	 }
	 
	 public Person updateTutorial(Integer id, String name, String email) throws NotFoundException {
	    Optional<Person> optPerson = personRepository.findById(id);

	    if (optPerson.isPresent()) {
	    	Person person = optPerson.get();

	      if (name != null)
	    	  person.setName(name);
	      if (email != null)
	    	  person.setEmail(email);

	      personRepository.save(person);
	      return person;
	    }
	    throw new NotFoundException("Not found Tutorial to update!");
	  }

	 
}
