package com.sfalcigno.grizzly.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("goodbyeworld")
public class GoodByeWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Good Bye World.";
    }
}


