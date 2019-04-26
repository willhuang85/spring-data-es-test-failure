package com.will.elasticsearchtest.resource;

import com.will.elasticsearchtest.entity.Vehicle;
import com.will.elasticsearchtest.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

    @Autowired
    private VehicleRepository repository;

    @GET
    public Response getVehicle() {
        Optional<Vehicle> vehicle = repository.findById("12345");
        return Response.ok(vehicle.get()).build();
    }

    @POST
    public Response postVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVin("12345");
        repository.save(vehicle);
        return Response.ok().build();
    }
}
