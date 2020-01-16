//bank 
//interface
package inheritance;

public class InterfaceDemo {
  //a public class so that we could name the file based on it +.java
	public static void main(String[] args)
	{
		Deposit d1;  //same as Deposit d= null
		d1= new FixedDeposit();
		d1.calcInterest();
		Deposit d2;
		d2= new Savings();
		d2.calcInterest();  //like upcasting?
	}
}

interface Deposit
{
	void dep();                         //taken as abstract because it is interface. All methods have to be abstract
	public abstract void calcInterest();
	public abstract void close();
}

class FixedDeposit implements Deposit
{
	@Override                  //annotations
	public void dep()
	{
		System.out.println("Fixed Deposit added");
	}
	@Override  
	public void calcInterest()
	{
		System.out.println("FD interest calculated annually");
	}
	public void close()
	{
		System.out.println("FD closed or matured");
	}
}

class Savings implements Deposit{
	@Override
	public void dep()
	{
		System.out.println("Savings added");
	}
	public void calcInterest()
	{
		System.out.println("Savings interest credited");
	}
	public void close()
	{
//		Just tried a dummy class. But not practical in real time application.
//		Abstract methods have to be overridden and implemented using atleast dummy class or made abstract again
//		If anyone method is abstract, then that class becomes abstract. 
	}	
}


