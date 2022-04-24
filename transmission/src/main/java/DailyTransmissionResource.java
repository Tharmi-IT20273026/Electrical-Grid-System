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

	    // post method
	   @POST
	    @Path("/dailytransmission")
	   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	    public DailyTransmission createDailyTransmission(DailyTransmission los){
	       repo.insertDailyTransmission(los);
	       return los;
	    }

	    //post method
	    @PUT
	    @Path("/dailytransmission")
	    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	    public DailyTransmission updateDailyTransmission(DailyTransmission los){
	        repo.updateDailyTransmission(los);
	        return los;
	    }

	    //delete method
	    @DELETE
	    @Path("dailytransmission/{daiTransId}")
	    public DailyTransmission killDailyTransmission(@PathParam("daiTransId") int daiTransId){
	    	DailyTransmission los = new DailyTransmission();

	        if(los.getDaiTransId()!=0)
	            repo.deleteDailyTransmission(daiTransId);
	        return los;
	    }

	}

