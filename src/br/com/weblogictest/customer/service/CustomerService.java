package br.com.weblogictest.customer.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.weblogictest.customer.entity.Customer;

@Stateless
@Path("/customer")
public class CustomerService {
	
	@GET
	@Path("/{id}")
	public Customer findAllById(@PathParam("id") Long id) {
		return new Customer(id, "Weblogic Admin");
	}	
}
