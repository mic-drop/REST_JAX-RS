package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.example.model.User;

@Path("/user")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public User getUser() {
        // Create a new user instance with a sample name
        return new User("Mic Drop");
    }
}
