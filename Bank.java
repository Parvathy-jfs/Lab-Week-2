package com.bank.oops;

public class Bank {

	public static void main(String[] args) {
		//creatingInstances();

	}
   
	//CREATING INSTANCES
	public static void creatingInstances() {
		Account a1= null;  //Creating the reference
		a1= new Account(); //Intializing the reference - instance?
		
		//a1.acceptDetails();   //without initialisation, 
		                        //it displays null values of all datatypes, or at least write a constructor
		a1.displayDetails();
	}
	
	
	//WORKING WITH ARRAYS
	Account a2;
	a2= new Account(); 
	Account arr[]= new Account[];
	

}
