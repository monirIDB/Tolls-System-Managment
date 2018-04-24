
package com.rasel.restful.tolls.resources;

import com.rasel.restful.tolls.model.TollsRate;
import com.rasel.restful.tolls.services.TollsRateServices;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/tollsrate")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TollsRateResources {
    
    private TollsRateServices tollsrateService = new TollsRateServices();
    
    @GET
    public List<TollsRate> getAllTollsRate(){
        
        return tollsrateService.getAllTollsRate();
    }
    
    @POST
    public TollsRate addTollsRate(TollsRate rate) {
        return tollsrateService.addTollsRate(rate);
    }
    
    @PUT
    @Path("/{tollsId}")
    public TollsRate updateTollsRate(@PathParam("tollsId") int tollsId, TollsRate tollsRate){
        tollsRate.setRateId(tollsId);
        return tollsrateService.updateTollsRate(tollsRate);
    }
    
    @DELETE
    @Path("/{tollsId}")
    public void removeTollsRate(@PathParam("tollsId") int tollsId){
        tollsrateService.removeTollsRate(tollsId);
    }
    
    @GET
    @Path("/{tollsId}")
    public TollsRate getTollsRate(@PathParam("tollsId") int tollsId){
      return tollsrateService.getTollsRate(tollsId);
    }
    
}
