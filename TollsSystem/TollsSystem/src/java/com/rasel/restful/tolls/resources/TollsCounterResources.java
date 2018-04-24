
package com.rasel.restful.tolls.resources;

import com.rasel.restful.tolls.model.TollsCounter;
import com.rasel.restful.tolls.services.TollsCounterServices;
import java.util.Date;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/tollscounter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TollsCounterResources {
    
     private TollsCounterServices tollscounter = new TollsCounterServices();
    
    @GET
    public List<TollsCounter> getAllTollsCounter(){
        return tollscounter.getAllTollsCounter();
    }
    
    @GET
    @Path("/byDate")
    public List<TollsCounter> tollsCounterByDate(){
        return tollscounter.tollsCounterByDate();
    }
    
    @POST
    public TollsCounter addTollsCounter(TollsCounter counter) {
        counter.setVehicleDate(new Date());
        counter.setVehicleTime(new Date());
        return tollscounter.addTollsCounter(counter);
    }
    
    @PUT
    @Path("/{tollsId}")
    public TollsCounter updateTollsRate(@PathParam("tollsId") int tollsId, TollsCounter counter){
        counter.setTollsId(tollsId);
        return tollscounter.updateTollsCounter(counter);
    }
    
    @DELETE
    @Path("/{tollsId}")
    public void removeTollsRate(@PathParam("tollsId") int tollsId){
        tollscounter.removeTollsCounter(tollsId);
    }
    
    @GET
    @Path("/{tollsId}")
    public TollsCounter getTollsCounter(@PathParam("tollsId") int tollsId){
      return tollscounter.getTollsCounter(tollsId);
    }
    
}
