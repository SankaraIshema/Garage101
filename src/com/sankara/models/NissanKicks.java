package com.sankara.models;

public class NissanKicks extends Vehicle {
	
	public NissanKicks() {
		super();
		this.name = "Nissan Kicks";
		this.price = this.getPrice();
		this.brand = Brand.NISSAN;
	}

	@Override
	public double getPrice() {
		
		return 29654.0;
	}
}