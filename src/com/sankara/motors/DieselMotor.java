package com.sankara.motors;

public class DieselMotor extends Motor {
	

	public DieselMotor(String power, double price) {
		super(power, price);
		this.motorType = MotorType.DIESEL;
	}
	
}
