package num2;

import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int  num=s.nextInt();
	int count=0;
	for(int i=1;i<=num;i++)
	{
		{
	     if( num % i==0)
	     count++;
		} 
	
	if (count==2)
	System.out.println(i+"prime");
	else
	System.out.println(i+"composite");
	}
	}

}
