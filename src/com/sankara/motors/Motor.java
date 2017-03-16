package com.sankara.motors;

import java.io.Serializable;

public abstract class Motor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5912973494126537121L;
	protected MotorType motorType;
	protected String power;
	protected double price = 0.0;
	
	
	public Motor(String power, double price) {
		this.power = power;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
	
	
	public MotorType getMotorType() {
		return motorType;
	}

	public void setMotorType(MotorType motorType) {
		this.motorType = motorType;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "\n\t-Motor type : " + motorType 
				+ "\n\t-Power : " + power 
				+ "\n\t-Price : " + price + " \u20ac";
	}

	
}
