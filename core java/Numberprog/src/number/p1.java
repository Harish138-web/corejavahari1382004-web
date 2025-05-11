package number;
import java.util.Scanner;


public class p1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter num");
		int num = s.nextInt();
		int rem;
		int rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
					
		}
	System.out.println(rev);
		}

	}


