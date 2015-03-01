package rest.json;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Lora on 10.12.2014.
 */
@Path("json")
public class JSONService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackJSON(){

        Track track = new Track();
        track.setTitle("Du Hast!");
        track.setGroup("Rammstein");

        return  track;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track){

        return Response.status(201).entity(track).build();
    }
}
