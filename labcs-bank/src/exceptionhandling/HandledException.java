package exceptionhandling;

public class HandledException {
	public static void main(String[] args)
	{
		int i= 100;
		int result= 0;
		System.out.println("Division by zero");
		try
		{
			result= i/0;
		}
		
		//HANDLED EXCEPTION
		
		catch(Exception exception){                     //Exception class and exception object
			System.out.println("Arithmetic Exception");
			return;                                    //to return if written alone 
//			                                            to return without printing anything 
		}
		System.out.println("Does not execute");
		System.out.println(result);
		
		
	}

}
