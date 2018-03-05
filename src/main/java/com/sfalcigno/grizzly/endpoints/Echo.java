package com.sfalcigno.grizzly.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
 
@Path("echo")
public class Echo {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@DefaultValue("Provide message ?message=a_message") @QueryParam("message") String message) {
        return message;
    }
}


