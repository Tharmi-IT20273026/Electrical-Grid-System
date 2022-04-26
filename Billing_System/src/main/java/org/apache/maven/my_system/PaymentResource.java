package org.apache.maven.my_system;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("payment")
public class PaymentResource {
	
	paymentRepository repo2 =new paymentRepository();
	
	
	 @POST
	   @Path("payment")
	   @Consumes({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON}) 
	    public Payment add(Payment payment){
	       repo2.add(payment);
	       return payment;
	    }
		
	 @PUT
	   @Path("payment/{cid}")
	   @Consumes({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON}) 
	    public Payment updateCard(Payment payment){
		 System.out.println(payment);
	       repo2.update(payment);
	       return payment;
	    }
	 
	 @DELETE
	 @Path("payment/{card_no}")
	 public Payment deleteCard(@PathParam("card_no")int card_no) {
		 Payment payment = repo2.(card_no);
		 
		 if(payment.getCard_no()!=0)
			 repo2.delete(card_no);
		 
		 return payment;
		 
		 
	 }
		
	
	

}
