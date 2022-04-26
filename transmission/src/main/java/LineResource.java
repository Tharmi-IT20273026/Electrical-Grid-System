import java.util.List;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/linedata")
public class LineResource {
	LineRepo repo =new LineRepo();

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Line> getLine(){

        System.out.println("Details of lines in our country");

       return repo.getline();

    }

    // post method
   @POST
    @Path("/line")
   @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Line createLine(Line los){
       repo.insertLine(los);
       return los;
    }

    //post method
    @PUT
    @Path("/lines")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Line updateLine(Line los){
        repo.updateLine(los);
        return los;
    }

    //delete method
    @DELETE
    @Path("linedata/{lineId}")
    public Line killLine(@PathParam("id") int lineId){
    	Line los = new Line();

        if(los.getLineId()!=0)
            repo.deleteLine(lineId);
        return los;
    }

}
