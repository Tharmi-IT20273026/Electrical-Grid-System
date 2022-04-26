import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("localSubstationss")
public class LocalSubstationResource {

    LocalSubRepo repo =new LocalSubRepo();

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<LocalSubstation> getLocalSubstations(){

        System.out.println("details of Local Substation in our country");

       return repo.getlocalStations();

    }

    // post method
   @POST
    @Path("localSubstation")
   @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public LocalSubstation createLocalSub(LocalSubstation los){
       repo.insertLocalSubStation(los);
       return los;
    }

    //post method
    @PUT
    @Path("localSubstation")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public LocalSubstation updateLocalSub(LocalSubstation los){
        repo.updateLocalSubstation(los);
        return los;
    }

    //delete method
    @DELETE
    @Path("localSubstation/{id}")
    public LocalSubstation killLocalSub(@PathParam("id") int id){
        LocalSubstation los = new LocalSubstation();

        if(los.getId()!=0)
            repo.deleteLocalSub(id);
        return los;
    }

}
