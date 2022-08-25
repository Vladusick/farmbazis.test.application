package rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rest.model.DataObject;
import rest.service.FarmService;

@Path("/examples")
public class DataObjectResource {

    private FarmService farmService = new FarmService();

    @GET
    @Path("test/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<DataObject> byId(@PathParam("id") int id) {
        return farmService.byId(id);
    }
}