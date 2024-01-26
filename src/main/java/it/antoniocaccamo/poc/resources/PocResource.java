package it.antoniocaccamo.poc.resources;

import java.util.List;
import java.util.stream.Collectors;

import it.antoniocaccamo.poc.dtos.PocDTO;
import it.antoniocaccamo.poc.repositories.PocRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/pocs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PocResource {

    @Inject
    PocRepository repo;

    @GET
    public List<PocDTO> getAll() {

        return repo.findAll()
                .list().stream()
                .map( poc-> 
                    new PocDTO().id(poc.getId()).name(poc.getName())
                ).collect(Collectors.toList());

    }

}
