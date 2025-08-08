package Arrays;

public class maxConsecutiveOne {
	public static void main(String[] args) {
		int[] a= {1,1,1,1,0,1,1,1,0,1,1};
		int count=0;
		int duplicate=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
			else if(count > duplicate) {
				duplicate=count;
				count=0;
				
			}
			
		}
		
			
		System.out.println(duplicate);
	}

}
