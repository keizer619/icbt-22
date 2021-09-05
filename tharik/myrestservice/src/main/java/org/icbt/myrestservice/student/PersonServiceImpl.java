/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


/**
 *
 * @author tharik
 */
@Path("/person")
public class PersonServiceImpl implements PersonService {

    @Override
    public Response addPerson(Person p) {
        Response response = new Response();
        response.setMessage("Not implemented");
        response.setStatus(false);
        return response;
    }

    @Override
    public Response deletePerson(int id) {
        Response response = new Response();
        response.setMessage("Not implemented");
        response.setStatus(false);
        return response;
    }

    @Override
    @GET
    @Path("/{id}")
    public Person getPerson(@PathParam("id")int id) {
        Person p = new Person();
        p.setAge(99);
        p.setName("John");
        p.setId(id);
        return p;
    }

    @Override
    @GET
    public Person[] getAllPersons() {
        Person[] persons = new Person[2];
        
        Person p = new Person();
        p.setAge(99);
        p.setName("John");
        p.setId(1);
        
        Person p2 = new Person();
        p2.setAge(98);
        p2.setName("George");
        p2.setId(2);


        persons[0] = p;
        persons[1] = p2;
        
        return persons;

    }
    
}
