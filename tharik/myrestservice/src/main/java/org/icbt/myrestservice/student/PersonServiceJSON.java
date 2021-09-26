/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.GET;
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
}
