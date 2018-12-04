package com.pluralsigth.gempresarial.models;

public class Client extends EntityBase {
	public String Name;
	public String LastName;
	public int Identification;
	public String Adress;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getIdentification() {
		return Identification;
	}
	public void setIdentification(int identification) {
		Identification = identification;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
}
