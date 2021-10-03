/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student.xml;

import java.util.HashMap;
import java.util.List;
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
import org.icbt.myrestservice.student.DBUtils;
import org.icbt.myrestservice.student.Person;


/**
 *
 * @author tharik
 */
@Path("/person-xml")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonServiceImpl implements PersonService {    
    @Override
    @POST
    public Response addPerson(Person p) {
        Response response = new Response();
        try {
            DBUtils.addPerson(p);
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
            DBUtils.updatePerson(p);            
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
            DBUtils.deletePerson(id);
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
        return DBUtils.getPerson(id);
    }

    @Override
    @GET
    public Person[] getAllPersons() {     
        List<Person> persons = DBUtils.getPersons();
        Person[] personsArray = new Person[persons.size()];
        int index = 0;
        for(Person p : persons) {
            personsArray[index] = p;
            index++;
        }
        return personsArray;
    }
    
}
