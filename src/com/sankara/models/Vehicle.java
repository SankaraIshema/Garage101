package com.sankara.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sankara.motors.Motor;
import com.sankara.options.Options;

public abstract class Vehicle implements Options, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3153451713281551338L;
	protected String name;
	protected double price;
	protected List<Options> carOptions = new ArrayList<Options>();
	protected  Brand brand;
	protected Motor motor;
	
	
	public Vehicle() {
		this.name = this.getName();
		this.price = this.getPrice();
		this.carOptions = this.getCarOptions();
		this.brand = this.getBrand();
	}
	
	public String getName() {
		return this.name;
	}
	
	public Brand getBrand() {
		return this.brand;
	}
	
	public void addOptions (Options option) {
	
			this.carOptions.add(option);
		}
	
	public String getStringOptions() {
		
		String str = "";
		
		for (Options opt : this.getCarOptions()) {
			
			str += "\t-" + opt.getClass().getSimpleName() 
						+ " - " + opt.getPrice() + " \u20ac\n";
		}
		return str;
	}
	
	public List<Options> getCarOptions() {
		return carOptions;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public double getPrice() {
		return this.getPrice();
	}
	
	public double getTotalPrice() {
		
		double vehiclePrice = 0.0;
		double motorPrice = 0.0;
		double optionsPrice = 0.0;
		
		vehiclePrice = this.getPrice();
		
		if (this.motor != null) {
			motorPrice = this.motor.getPrice();
		}
		
		for (Options opt : this.carOptions) {
			
			optionsPrice += opt.getPrice();
		}
		return vehiclePrice + motorPrice + optionsPrice;
		
	}
	
	@Override
	public String toString() {
		return "Vehicle name is " + name 
				+ "\nBrand : " + this.brand
				+ "\nPrice : " + price + " \u20ac"
				+ "\nMotor : " + motor + "\n"
				+ "\nCar options :\n" + this.getStringOptions() + "\n"
				+ "\nTotal price : " + this.getTotalPrice() + " \u20ac"	
				+ "\n-----------------------------------\n\n";

	}
	
}
