package org.fmmonteiro.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.fmmonteiro.model.dtos.response.Cruise;
import org.fmmonteiro.model.dtos.response.UpcomingShip;
import org.fmmonteiro.service.ShipService;

import java.util.List;

@Path("/ship")
@AllArgsConstructor
public class ShipResource {

    private final ShipService shipService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/most-popular")
    public List<Cruise> retrieveTopShips() {
        return shipService.getAllCruises();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upcoming-ships")
    public List<UpcomingShip> retrieveUpcomingShips() {
        return shipService.getUpcomingShips();
    }
}
