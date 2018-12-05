package com.pluralsigth.gempresarial.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsigth.gempresarial.models.Client;
import com.pluralsigth.gempresarial.models.EntityBase;



public class ClientRepository implements IRepository {

	@Override
	public List<Client> Get() {
		List<Client> clients = new ArrayList<Client>();
		Client client = new Client();

		client.setID(1);
		client.setAdress("Calle Jose Contreras");
		client.setIdentification("00118589571");
		clients.add(client);
		
		return clients;
	}

	@Override
	public Client GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Add(EntityBase entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(EntityBase entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Edit(EntityBase entity) {
		// TODO Auto-generated method stub
		
	}

	

}
