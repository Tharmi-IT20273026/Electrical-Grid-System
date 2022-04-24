import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/juncture")
public class JunctureResource {
	JunctureRepo repo =new JunctureRepo();

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Juncture> getJuncture(){

        System.out.println("details of juncture in our country");

       return repo.getjuncture();

    }

    // post method
   @POST
    @Path("/juncture")
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Juncture createJuncture(Juncture los){
       repo.insertJuncture(los);
       return los;
    }

    //post method
    @PUT
    @Path("/juncture")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Juncture updateJuncture(Juncture los){
        repo.updateJuncture(los);
        return los;
    }

    //delete method
    @DELETE
    @Path("juncture/{juncId}")
    public Juncture killJuncture(@PathParam("juncId") int juncId){
    	Juncture los = new Juncture();

        if(los.getJuncId()!=0)
            repo.deleteTransmission(juncId);
        return los;
    }

}
