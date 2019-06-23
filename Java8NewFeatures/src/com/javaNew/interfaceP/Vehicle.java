package com.javaNew.interfaceP;

public interface Vehicle {

	public void description();
	public default void drive() {
		System.out.println("Drive the Vehicle:");
	}
}
