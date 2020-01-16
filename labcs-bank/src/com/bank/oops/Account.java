//banking management system
package com.bank.oops;

public class Account {       //camelCase
	//abstract datatype
	String custName;
	String accType;
	
	//primitive datatype
	int accNumber;
	int cifNumber;     //longint ? why 0098??
	int branchCode;
	int ifscCode;
	double balance;

/*	public void acceptDetails()   //initialization
	{
		custName= "Anjali";
		accType= "Savings";
		accNumber= 600;
		cifNumber= 8;
		branchCode= 1023;
		ifscCode= 95;
		balance= 200000;
	} 
	*/
	
	//DEFAULT CONSTRUCTOR
	public Account() {
		custName = "Anjali";
		accType = "Savings";
		accNumber = 600;
		cifNumber = 8;
		branchCode = 1023;
		ifscCode = 95;
		balance = 200000;
	}
	
	
	//PARAMETERIZED CONSTRUCTOR
	
	public Account(String pcustName, String paccType) //other parameters will be initialized to 0, 0.0, or null
	{
		custName = "Anjali";
		accType = "Savings";
	}
	

	//OVERLOADED CONSTRUCTOR
	public Account (String pcustName, String paccType, 
			int paccNumber, int pcifNumber, double pbalance) //p=parameters, else use this keyword 
	                                                         //to refer to 
	                                                         //instance over parameter variables
	{
		custName = "Anjali";
		accType = "Savings";
		accNumber = 600;
		cifNumber = 8;
		branchCode = 1023;
		ifscCode = 95;
		balance = 200000;
	}
	
	
	public void displayDetails() {
		System.out.println(custName);
		System.out.println(accNumber);
		System.out.println(cifNumber);
		System.out.println(accType);
		System.out.println(branchCode);
		System.out.println(ifscCode);
		System.out.println(balance);
	}

}


