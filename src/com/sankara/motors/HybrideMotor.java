package com.sankara.motors;

public class HybrideMotor extends Motor {
	

	public HybrideMotor(String power, double price) {
		super(power, price);
		this.motorType = MotorType.HYBRIDE;
	}
	
}
