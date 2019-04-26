package com.will.elasticsearchtest.resource;

import com.will.elasticsearchtest.entity.Vehicle;
import com.will.elasticsearchtest.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

    @Autowired
    private VehicleRepository repository;

    @GET
    @Path("{vin}")
    public Response getVehicle(@PathParam("vin") String vin) {
        Optional<Vehicle> vehicle = repository.findById(vin);
        return Response.ok(vehicle.orElse(null)).build();
    }

    @POST
    @Path("{vin}")
    public Response postVehicle(@PathParam("vin") String vin) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVin(vin);
        repository.save(vehicle);
        return Response.ok().build();
    }
}
