package com.sankara.models;

public class Peugeot508 extends Vehicle {
	
	public Peugeot508() {
		super();
		this.name = "Peugeot 508";
		this.price = this.getPrice();
		this.brand = Brand.PEUGEOT;
	}

	@Override
	public double getPrice() {
		
		return 21795.0;
	}
}
