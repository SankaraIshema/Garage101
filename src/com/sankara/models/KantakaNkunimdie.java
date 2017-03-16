package com.sankara.models;

public class KantakaNkunimdie extends Vehicle {
	
	public KantakaNkunimdie() {
		super();
		this.name = "Kantaka 500";
		this.price = this.getPrice();
		this.brand = Brand.KANTAKA;
	}

	@Override
	public double getPrice() {
		
		return 32395.0;
	}
}
