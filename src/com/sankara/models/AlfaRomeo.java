package com.sankara.models;

public class AlfaRomeo extends Vehicle {
	
	public AlfaRomeo() {
		super();
		this.name = "Alpha Romeo";
		this.price = this.getPrice();
		this.brand = Brand.ALFA_ROMEO;
	}

	@Override
	public double getPrice() {
		
		return 37995.0;
	}
}
