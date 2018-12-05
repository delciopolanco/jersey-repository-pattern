package com.pluralsigth.gempresarial;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.pluralsigth.gempresarial.repository.ClientRepository;
import com.pluralsigth.gempresarial.models.BHDLeonResponse;
import com.pluralsigth.gempresarial.models.Client;

/**
 * Root resource (exposed at "client" path)
 */
@Path("client")
public class ClientController {

	private ClientRepository _clientReposity = new ClientRepository();

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@SuppressWarnings("unchecked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response get() {

		List<Client> clients = this._clientReposity.Get();

		if (clients == null || clients.isEmpty()) {
			return new BHDLeonResponse<String>().withError("En estos momentos no podemos recuperar la info");
		}

		return new BHDLeonResponse<List<Client>>().withSuccess(clients);

	}

}
