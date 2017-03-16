package com.sankara.models;

public class Fiat500 extends Vehicle{
	
	public Fiat500() {
		super();
		this.name = "Fiat 500";
		this.price = this.getPrice();
		this.brand = Brand.FIAT;
	}

	@Override
	public double getPrice() {
		
		return 21695.0;
	}
}
