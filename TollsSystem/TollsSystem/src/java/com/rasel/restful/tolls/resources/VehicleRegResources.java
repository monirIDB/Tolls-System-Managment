
package com.rasel.restful.tolls.resources;

import com.rasel.restful.tolls.model.VehicleReg;
import com.rasel.restful.tolls.services.VehicleRegServices;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/vehiclereg")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VehicleRegResources {
    
    VehicleRegServices vehicleServices = new VehicleRegServices();
    
    @GET
    public List<VehicleReg> getAllVehicle(){
        
        return vehicleServices.getAllVehicle();
    }
    
    @POST
    public VehicleReg addVehicle(VehicleReg vehicle){
        
        return vehicleServices.addVehicle(vehicle);
    }
    
    @PUT
    @Path("/{vehicleId}")
    public VehicleReg updateVehicle(@PathParam("vehicleId") int vehicleId, VehicleReg vehicle){
        vehicle.setVehicleId(vehicleId);
        return vehicleServices.updateVehicle(vehicle);
    }
    
    
    @DELETE
    @Path("/{vehicleId}")
    public void removeVehicle(@PathParam("vehicleId") int vehicleId){
        
        vehicleServices.removeVehicle(vehicleId);
    }
    
    @GET
    @Path("/{vehicleId}")   
    public VehicleReg getVehicle(@PathParam("vehicleId") int vehicleId) {
        
      return vehicleServices.getVehicle(vehicleId);
    }
    
}
