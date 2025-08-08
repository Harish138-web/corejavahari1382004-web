package Arrays;

import java.util.Iterator;

public class MissingNum {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		int[] b= {1,3,4,5};
		int sum1=0;
		for(int j=0;j<b.length;j++) {
			sum1=sum1+b[j];
			
		}
		int missing =sum-sum1;
		System.out.println(missing);
		
	}

}
