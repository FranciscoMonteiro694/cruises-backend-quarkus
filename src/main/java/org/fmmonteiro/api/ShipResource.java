package org.fmmonteiro.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.fmmonteiro.model.Cruise;
import org.fmmonteiro.model.repository.CruiseRepository;

import java.util.List;

@Path("/ships")
public class ShipResource {

    @Inject
    CruiseRepository cruiseRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cruise> retrieveShips() {
        return cruiseRepository.getAllCruises();
    }
}
