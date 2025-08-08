package Arrays;

public class SortedOrNot {

	public static void main(String[] args) {
		int[] a= {50,10,20,30};
		System.out.println(sorted(a));
		
	}
	static boolean sorted(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
		
	}
}
