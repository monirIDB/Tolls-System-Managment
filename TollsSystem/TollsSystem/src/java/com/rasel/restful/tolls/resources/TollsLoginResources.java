package com.rasel.restful.tolls.resources;

import com.rasel.restful.tolls.model.TollsLogin;
import com.rasel.restful.tolls.services.TollsLoginServices;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/tollslogin")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TollsLoginResources {

    private TollsLoginServices loginServices = new TollsLoginServices();

    @GET
    public List<TollsLogin> getAllTollsLogin() {
        return loginServices.getAllTollsLogin();
    }

    @POST
    @Path("/userlogin")
    public TollsLogin findUserLogin(TollsLogin login) {
        return loginServices.findUserLogin(login);
    }

}
