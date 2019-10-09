package com.rakeshv;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greetings")
public class GreetingsResource {

    @Inject
    GreetingsService greetingsService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingsService.getGreetings() + "\n";
    }
}