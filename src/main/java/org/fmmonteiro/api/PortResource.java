package org.fmmonteiro.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.fmmonteiro.model.dtos.response.Port;
import org.fmmonteiro.service.PortService;

import java.util.List;

@Path("/port")
@AllArgsConstructor
public class PortResource {

    private final PortService portService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/most-popular")
    public List<Port> retrieveTopPorts() {
        return portService.getAllPorts();
    }
}
