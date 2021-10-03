/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myrestservice.student;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author tharik
 */
@Path("/login")
public class Login {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String login(String json) {
         User user = new Gson().fromJson(json, User.class);
         ResponseJSON res = new ResponseJSON();
         if (user.getUsername().equals("admin") && user.getPassword().equals("admin123")) {
             res.setMessage("success");
         } else {
             res.setMessage("unsuccessful");
         }
            
         Gson gson = new GsonBuilder().create();
         return gson.toJson(res);
    }
}
