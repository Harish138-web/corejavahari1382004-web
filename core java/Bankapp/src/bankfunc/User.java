package bankfunc;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = s.nextLine();
		System.out.println("Enter Your Age");
		byte age = s.nextByte();
		System.out.println("Enter Your PAN ");
		String pan = s.next();
		System.out.println("Enter Your aadhaar");
		long aadhaar=s.nextLong();
		System.out.println("enter your ph_no");
		long phone=s.nextLong();
		System.out.println("email_id"); 
		String mail = s.next();
		
		if(age>=18) {
			System.out.println("Your Account Number is "+654987321L);
			System.out.println("Branch:Singapore");
			System.out.println("IFSC CODE:SING654987");
			System.out.println("*********************");
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAW");
			System.out.println("3.FUND TRANSFER");
			System.out.println("4.CHECK BALANCE");
			byte inp = s.nextByte();
			switch(inp)
			{
			case 1:{
				System.out.println("Enter amt");
				functions.deposit(s.nextDouble());
				break;}
			case 2:{
				System.out.println("Enter amt");
				functions.withdraw(s.nextDouble());
				break;	}
			case 3:{
				System.out.println("Enter amt");
				functions.fundtransfer(s.nextDouble());
				break;}	
			case 4:{
				System.out.println("Your Balance is"+ functions.checkbalance());
				break;	}
            default:{
            	System.out.println("INVAlID");
                 }
			
			}
					
		}
		
	
	}

}
