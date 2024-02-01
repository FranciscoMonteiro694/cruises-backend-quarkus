package org.fmmonteiro.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.fmmonteiro.model.dtos.response.Company;
import org.fmmonteiro.service.CompanyService;

import java.util.List;

@Path("/company")
@AllArgsConstructor
public class CompanyResource {

    private final CompanyService companyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/most-popular")
    public List<Company> retrieveTopCompanies() {
        return companyService.getAllCompanies();
    }
}
