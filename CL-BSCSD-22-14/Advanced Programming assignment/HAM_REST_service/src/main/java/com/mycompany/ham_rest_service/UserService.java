/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ham_rest_service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Admin
 */
@Path("/user")
public class UserService {
    
    @GET
    public String getUserCredentials() {
        
        System.out.println("------->OK");
        String admin="admin";
        
        UserDBQueries.getUser(admin);
        User user=new User();
        System.out.print("userName"+user.getUsername());
        System.out.print("Password"+user.getPassword());
        try{
        return null;
        }
        catch (Exception e)
        {
           throw e;
        }

    }
}
