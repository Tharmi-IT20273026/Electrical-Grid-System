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

  

    //post method
    @PUT
    @Path("/transmission")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Transmission updateTransmission(Transmission los){
        repo.updatetransmission(los);
        return los;
    }

   

}
