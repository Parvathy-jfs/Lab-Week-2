package inheritance;

public class AbstractClassDemo {
	public static void main(String[] args)
	{
		
		
	}
	abstract class Banking        //only 1 public class per src. Names the src based on that.
	{
		public void fundTransfer();
		public void cashWithdrawal();
		
		
	}
	class NetBanking extends Banking         // Interfaces are implemented
	{
		public void fundTransfer()
		{
			System.out.println("Fund Transfer via Net Banking");
		}
		public void cashWithdrawal()
		{
			System.out.println("Cash Withdrawal using Net Banking");
		
	}
	class Cheque extends Banking
	{
		public void fundTransfer()
		{
			System.out.println("Fund Transfer via Cheque ");
		}
		public void cashWithdrawal()
		{
			System.out.println("Cash Witdhdrawal via Net Banking");
	}
	
			
			
		}
	}
	
	

}
