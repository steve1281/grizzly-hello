package com.sfalcigno.grizzly.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        System.out.println("helloworld - getIt called");
        return "Hello World.";
    }
}


