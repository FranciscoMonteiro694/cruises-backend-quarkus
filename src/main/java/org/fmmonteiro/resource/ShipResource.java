package org.fmmonteiro.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ships")
public class ShipResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String retrieveShips() {
        return "Retrieving all ships...";
    }
}
