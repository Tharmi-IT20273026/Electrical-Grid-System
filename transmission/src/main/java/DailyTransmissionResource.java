import java.util.List;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

	@Path("/dailytransmission")
	public class DailyTransmissionResource {
		DailyTransmissionRepo repo =new DailyTransmissionRepo();

	    @GET
	    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	    public List<DailyTransmission> getDailyTransmission(){

	        System.out.println("Details of DailyTransmission in our country");

	       return repo.getdailytransmission();

	    }

	

	}

