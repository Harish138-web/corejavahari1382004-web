package Arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {
	public static void main(String[] args) {
		int[] a= {0,1,2,0,0,1,6};
//		int[] a1= new int[a.length];
//		int j=0;
//		for(int i=0;i<a.length;i++) {
//			
//		if(a[i]!= 0){
//			a1[j++]+=a[i];
//	
//		}
//	
//		}
//
//		System.out.println(Arrays.toString(a1));
//		
//	}
		int i=0;
		int j=0;
		for( j=0;j<a.length;j++){
			if(a[j]!=0) {
			int temp =a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			
			}
		}
		System.out.println(Arrays.toString(a));
	}
	

}
