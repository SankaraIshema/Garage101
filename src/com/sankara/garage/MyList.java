package com.sankara.garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sankara.models.Vehicle;

public class MyList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7280145241629695422L;
	protected List<Vehicle> myList;
	
	
	public MyList() {

		this.myList = new ArrayList<Vehicle>();
	}

	public List<Vehicle> getMyList() {
		return myList;
	}
	
}
