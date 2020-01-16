package com.aerospace;

public class Aeroplane extends Aircraft {
	public int aeroplaneId;
	public String aeroplaneName;
	public Aeroplane(int aeroplaneId, String aeroplaneName){
		super(); //??
		this.aeroplaneId= aeroplaneId;
		this.aeroplaneName= aeroplaneName; //this to refer to the instance variable over 
                                           //recently declared parameter variable
		
	}
	@Override
	public void fly() {
		System.out.println("Aeroplanes fly using jet engines and wings!");
	}
	@Override
	public void addFuel() {
		System.out.println("Fuel tanks located inside the aeroplane wings");
	}
	@Override
	public String toString() {
		return "[Aeroplane Details: \n Aeroplane Id=" + aeroplaneId + " \n Aeroplane Name=" + aeroplaneName + "]";
	}

}
