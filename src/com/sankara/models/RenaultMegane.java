package com.sankara.models;

public class RenaultMegane extends Vehicle {
	
	

	public RenaultMegane() {
		super();
		this.name = "Renault Megane";
		this.price = this.getPrice();
		this.brand = Brand.RENAULT;
	}

	@Override
	public double getPrice() {
		
		return 18200.0;
	}	
	
}
