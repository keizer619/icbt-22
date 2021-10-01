/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
@Path("/person-json")
public class PersonServiceJSON {
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson(@PathParam("id")int id) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(DBUtils.getPerson(id));
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersons() {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(DBUtils.getPersons());
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPerson(String json) {
        Person p = convertJsonToPerson(json);
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
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePerson(String json) {
        Person p = convertJsonToPerson(json);
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

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
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
    
    Person convertJsonToPerson(String json) {
        return new Gson().fromJson(json, Person.class);
    }
}
