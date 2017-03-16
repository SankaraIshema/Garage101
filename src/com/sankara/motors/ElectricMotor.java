package com.sankara.motors;

public class ElectricMotor extends Motor {
	
	
	public ElectricMotor(String power, double price) {
		super(power, price);
		this.motorType = MotorType.ELECTRIQUE;
	}
	
}
