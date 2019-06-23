package com.javaNew.interfaceImpl;

import com.javaNew.interfaceP.Vehicle;

public class Bike implements Vehicle {

	@Override
	public void description() {
		System.out.println("R15 Model 2018:");
		
	}
	public static void main(String[] args) {
		Vehicle vehicle=new Bike();
		vehicle.description();
		vehicle.drive();
	}

}
