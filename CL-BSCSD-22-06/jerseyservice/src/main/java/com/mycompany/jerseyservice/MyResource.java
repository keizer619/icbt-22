package com.mycompany.jerseyservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;


@Path("/myresource")
public class MyResource {

    @GET
    public Response getMessage(@PathParam("Hellooooooo") String msg){
    String message = "Hello " + msg;
        return Response.status(200).entity(message).build();
    }
}
