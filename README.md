# GraphQL-Resolver
GraphIQL Project with Spring boot and JPA . Resolver approch to get the sub class in parent class object

http://localhost:8080/graphiql

# get allPerson with address
{
   getAllPersons{
    person_id
    name
    addressId
    address{
      addres_id
      city
      pin
    }
  }
}	

# get allAddress
{
  getAllAddress{
   addres_id
     house_no
    city
    pin
   }
}	

# getPersonAndAddressById

{
  getPersonById(person_id:1){
    person_id
    name
    email
    dob
    addressId
    address{
      addres_id
      house_no
      city
      pin
    }
  }
}	
