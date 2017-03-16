package com.sankara.models;

public class MitsubishiOutlander extends Vehicle {
	
	public MitsubishiOutlander() {
		super();
		this.name = "Mitsubishi Outlander";
		this.price = this.getPrice();
		this.brand = Brand.MITSUBISHI;
	}

	@Override
	public double getPrice() {
		
		return 23695.0;
	}
}
