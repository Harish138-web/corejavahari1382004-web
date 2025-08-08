package Arrays;

import java.util.Arrays;

public class DutchNationalFlag {
	public static void main(String[] args) {
		int[] a = {2,1,0,2,1,0,2,1,0};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length-1;j++) {
//				if(a[j]>a[j+1]) {
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
		int low=0;
		int mid=0;
		int high=a.length-1;
		while(mid<=high) {
			if(a[mid]==0) {
				int temp=a[mid];
				a[mid]=a[low];
				a[low]=a[mid];
				mid++;
				low++;
			}
			else if(a[mid]==1){
				mid++;
		}
			else {
				int temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
				
			}
	}
		System.out.println(Arrays.toString(a));

}
}
