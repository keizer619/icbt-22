/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author tharik
 */
@Path("/person")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonServiceImpl implements PersonService {

    private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
    
    
    @Override
    @POST
    public Response addPerson(Person p) {
        Response response = new Response();
        try {
            persons.put(p.getId(), p);
            response.setMessage("Person is added");
            response.setStatus(true);
        } catch(Exception e) {
            response.setMessage("Person is not added");
            response.setStatus(false); 
        }
        return response;
    }
    
    @Override
    @PUT
    public Response updatePerson(Person p) {
        Response response = new Response();
        try {
            persons.remove(p.getId());
            persons.put(p.getId(), p);            
            response.setMessage("Person is updated");
            response.setStatus(true);
        } catch(Exception e) {
            response.setMessage("Person is not updated");
            response.setStatus(false); 
        }
        return response;
    }

    @Override
    @DELETE
    @Path("/{id}")
    public Response deletePerson(@PathParam("id")int id) {
        Response response = new Response();
        try {
            persons.remove(id);
            response.setMessage("Person is deleted");
            response.setStatus(true);
        } catch(Exception e) {
            response.setMessage("Person is not deleted");
            response.setStatus(false); 
        }
        return response;
    }

    @Override
    @GET
    @Path("/{id}")
    public Person getPerson(@PathParam("id")int id) {
        return persons.get(id);
    }

    @Override
    @GET
    public Person[] getAllPersons() {        
        Set<Integer> ids = persons.keySet();
        Person[] personsArray = new Person[ids.size()];
        int i = 0;
        for (Integer id : ids) {
            personsArray[i] = persons.get(id);
            i++;
        }
        return personsArray;
    }
    
}
