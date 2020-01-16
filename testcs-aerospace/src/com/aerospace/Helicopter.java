package com.aerospace;

public class Helicopter extends Aircraft {
	@Override
	public void fly() {
		System.out.println("Helicopter flies using rotors.");
	}
	@Override
	public void addFuel() {
		System.out.println("Fuel added to helicopter!");
	}

}
