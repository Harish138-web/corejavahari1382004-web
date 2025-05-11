package bankfunc;

public class functions {
	static double bankbal=25000;
	public static void deposit(double amt)
	{
		bankbal+=amt;
		System.out.println("Amount Deposited");
		
	}
	
	public static void withdraw(double amt)
	{
		bankbal-=amt;
		System.out.println("Amount withdrawn");
		
	}
	public static void fundtransfer(double amt)
	{
		bankbal-=amt;
		System.out.println("Amount Transferred");
		
	}
	public static double  checkbalance()
	{
		return bankbal;
		
	}
	
	
}
