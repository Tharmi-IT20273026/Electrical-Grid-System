package org.apache.maven.my_system;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


import java.lang.annotation.Repeatable;
import java.util.Arrays;
import java.util.List;


@Path("customer")
public class CustomerResource {

	customerRepository repo =new customerRepository();

  /** @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Customer> getCustomer(){

        System.out.println("details of Local Substation in our country");

       return customer1.getCustomer();

    }
 **/
	
	@GET
	@Path("customer/{id}")
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public Customer getCustomer(@PathParam("id")int id)
	{
		return repo.getCustomer(id);
	}
	;

    // post method
   @POST
   @Path("customer")
   @Consumes({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON}) 
    public Customer createCutomer(Customer customer1){
       repo.create(customer1);
       return customer1;
    }
	

}
