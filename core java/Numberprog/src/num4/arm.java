package num4;

public class arm {
	public static void main(String[] args)
	{
		int onum=152;
		int rem;
		int sum=0;
		while(onum>0){
			rem=onum%10;
			sum=sum+rem*rem*rem;
			onum=onum/10;
		}
		if(onum==sum) {
			System.out.println("amstrong");}
		
	}

}
