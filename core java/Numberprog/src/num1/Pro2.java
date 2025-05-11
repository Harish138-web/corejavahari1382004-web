package num1;
import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int num=s.nextInt();
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
			
		}
		// TODO Auto-generated method stub
System.out.println(sum);
	}
}


