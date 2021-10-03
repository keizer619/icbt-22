/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import org.icbt.myrestservice.student.xml.Response;
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
@Path("/person")
public class PersonService {
    
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
    public String addPerson(String json) {
        Person p = convertJsonToPerson(json);
        ResponseJSON response = new ResponseJSON();
        try {
            DBUtils.addPerson(p);
            response.setMessage("Person is added");
        } catch(Exception e) {
            response.setMessage("Person is not added");
        }
        Gson gson = new GsonBuilder().create();
        return gson.toJson(response);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String updatePerson(String json) {
        Person p = convertJsonToPerson(json);
        ResponseJSON response = new ResponseJSON();
        try {
            DBUtils.updatePerson(p);            
            response.setMessage("Person is updated");
        } catch(Exception e) {
            response.setMessage("Person is not updated"); 
        }
        Gson gson = new GsonBuilder().create();
        return gson.toJson(response);
    }

    @DELETE
    @Path("/{id}")
    public String deletePerson(@PathParam("id")int id) {
        ResponseJSON response = new ResponseJSON();
        try {
            DBUtils.deletePerson(id);
            response.setMessage("Person is deleted");
        } catch(Exception e) {
            response.setMessage("Person is not deleted");
        }
        Gson gson = new GsonBuilder().create();
        return gson.toJson(response);
    }
    
    Person convertJsonToPerson(String json) {
        return new Gson().fromJson(json, Person.class);
    }
}
