import java.util.List;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/transmission")
public class TransmissionResource {
	TransmissionRepo repo =new TransmissionRepo();

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Transmission> getTransmission(){

        System.out.println("details of transmission in our country");

       return repo.gettransmission();

    }

    // post method
   @POST
    @Path("/transmission")
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Transmission createTransmission(Transmission los){
       repo.insertTransmission(los);
       return los;
    }

    //post method
    @PUT
    @Path("/transmission")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Transmission updateTransmission(Transmission los){
        repo.updateTransmission(los);
        return los;
    }

    //delete method
    @DELETE
    @Path("transmission/{transSubId}")
    public Transmission killTransmission(@PathParam("transSubId") int transSubId){
    	Transmission los = new Transmission();

        if(los.getTransSubId()!=0)
            repo.deleteTransmission(transSubId);
        return los;
    }

}
