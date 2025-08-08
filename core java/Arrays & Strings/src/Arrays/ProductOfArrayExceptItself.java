package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
	public static void main(String[] args) {
	int[] a= {2,1,4,3,5};
	int [] left=new int [a.length];
	int[] right = new int [a.length];
	right[a.length -1]=1;
	left[0]=1;
	for(int i=1;i<a.length;i++) {
		
		left[i]=left[i-1]*a[i-1];
	}
	for(int i=a.length-2;i>=0;i--) {
		
		right[i]=right[i+1]*a[i+1];
	}
	int[] op=new int[a.length];
	for(int i=0;i<a.length;i++) {
		op[i]=left[i]*right[i];
		
	}
	System.out.println(Arrays.toString(left));
	System.out.println(Arrays.toString(right));
	System.out.println(Arrays.toString(op));
	
	}

}
