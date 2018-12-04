package com.pluralsigth.gempresarial;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pluralsigth.gempresarial.repository.ClientRepository;
import com.pluralsigth.gempresarial.models.Client;

/**
 * Root resource (exposed at "client" path)
 */
@Path("client")
public class ClientController {
	
	private ClientRepository _clientReposity = new ClientRepository();

	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @SuppressWarnings("unchecked")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Client> get() {
    	ArrayList name = new ArrayList();
    	name.add("Hello World");
    	
    	ArrayList another = this._clientReposity.Get();
    	
        return another == null ? name : another;
    }
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get(int id) {
        return "Got it!";
    }
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String save() {
        return "Got it!";
    }
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public String update() {
        return "Got it!";
    }
    
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String delete() {
        return "Got it!";
    }
}
