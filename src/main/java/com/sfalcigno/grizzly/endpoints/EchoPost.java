package com.sfalcigno.grizzly.endpoints;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

/*
* POSTed, so use a tool like Postman ; send some text via raw.
*/ 
@Path("echopost")
public class EchoPost {
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(String message) {
        return message;
    }
}


