// (c) 2016 Pason Systems

package com.fallcon.library.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * 
 */
@Path("/hello")
public class HelloResource
{
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting() {
        return "Hello world!";
    }
}
