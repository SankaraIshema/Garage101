package com.sankara.garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;

import com.sankara.models.Vehicle;

public class Garage {
	
	private static MyList myCarStock = new MyList();
	private static File file = new File("myCarStock.txt");
	
	//A comment
	public Garage() {
		Garage.myCarStock = this.readMyCarStock();
	}

	public static MyList getMyCarStock() {
		return myCarStock;
	}
	
	public File getFile() {
		return file;
	}

	public void addCar(Vehicle vehicle) {
		Garage.myCarStock.getMyList().add(vehicle);
		this.writeMyCarStock();	
	}
	
	public void addSomeCars(List<Vehicle> tempList) {
		Garage.myCarStock.getMyList().addAll(tempList);
		this.writeMyCarStock();
	}
	
	public void removeCar(Vehicle vehicle) {
		if(Garage.myCarStock.getMyList().isEmpty()) {
			System.out.println("It appears the stock is empty\n"
								+ "\t- Perhaps would it be wise "
								+ "to purchase some new cars ?");		
		}
		else {
			Iterator<Vehicle> it = Garage.myCarStock.getMyList().iterator();
			
			while(it.hasNext()) {
				Vehicle v = it.next();
				
				if(v.toString().equals(vehicle.toString())) {
					it.remove();
				}
			}
			this.writeMyCarStock();
		}	
	}
	
	public void removeSomeCars(List<Vehicle> tempList) {
		Garage.myCarStock.getMyList().removeAll(tempList);
		this.writeMyCarStock();
	}
	
	public void removeAllCars() {
		Garage.myCarStock.getMyList().clear();
		this.writeMyCarStock();
	}
	
	public void writeMyCarStock() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									this.getFile())));
			
			oos.writeObject(Garage.myCarStock);
			
		}
		catch( FileNotFoundException e)      { e.printStackTrace(); }
		catch( IOException e)                { e.printStackTrace(); }
		finally {
			 try {
				 if(oos != null) oos.close();
			 }catch(IOException e)           { e.printStackTrace(); }
		 }  
	}
	
	public MyList readMyCarStock() {
		ObjectInputStream ois = null;
		MyList tempList = new MyList();
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									this.getFile())));
			
			try {
				tempList = (MyList) ois.readObject();
			} 
			catch (ClassNotFoundException e) { e.printStackTrace(); }
			
		}
		catch( FileNotFoundException e)      { e.printStackTrace(); }
		catch( IOException e)                { e.printStackTrace(); }
		finally {
			 try {
				 if(ois != null) ois.close();
			 }catch(IOException e)           { e.printStackTrace(); }
		 } 
		return tempList;
	}
	
	
	public String stringUpMyCarStock() {
		List<Vehicle> tempList = Garage.myCarStock.getMyList();
		String str = "";
		
		for (Vehicle v : tempList) {
			str += v.toString();
		}
		if(str != "")return str;
		else {
			return "It appears the stock is empty\n"
					+ "\t- Perhaps would it be wise to purchase some new cars ?";
		}
	}

	@Override
	public String toString() {
		return    "****************************\n"
				+ "*****GARAGE T'INQUIÈTE******\n"
				+ "****************************\n\n"
				+ "My garage contains " + Garage.myCarStock.getMyList().size() + " cars.\n\n"
				+ this.stringUpMyCarStock();
	}
	
}
