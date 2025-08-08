package Arrays;

import java.security.AllPermission;
import java.util.ArrayList;

public class LeadeBoard {
	public static void main(String[] args) {
		int[] a= {20,30,5,8,3,2,6};
//		for(int i=0;i<a.length;i++) {
//			int j;
//			for(j=i+1;j<a.length;j++) {
//			if(a[j]>a[i]) {
//				break;
//			}
//			}
//		
//			if(j==a.length) {
//				System.out.println(a[i]+" ");
//				
//			}
//			}
	ArrayList al = new ArrayList<>();
	int leader =a[a.length-1];
	al.add(leader);
	for(int i=a.length-1;i>=0;i--) {
		if(a[i]>leader) {
			leader=a[i];
			al.add(leader);
		}
	}
		
 System.out.println(al.toString());

}
}
