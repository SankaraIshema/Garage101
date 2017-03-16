package com.sankara.motors;

public class EssenceMotor extends Motor {
	
	
	public EssenceMotor(String power, double price) {
		super(power, price);
		this.motorType = MotorType.ESSENCE;
	}
	
}
