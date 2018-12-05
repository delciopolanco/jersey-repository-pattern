package com.pluralsigth.gempresarial.models;

import java.util.AbstractCollection;
import java.util.AbstractList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class EntityBase<T> {
	private int ID;
	
	@XmlElement(nillable=true)
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
