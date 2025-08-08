package Arrays;

public class FreqOfEachElement {

	public static void main(String[] args) {
		int[] a= {1,4,5,1,4,4,5,4,2,4,2,2};
		boolean visited[] = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visited[i]) {
				continue;
			}
		
		int c=1;
		for(int j=i+1;j<a.length ;j++) {
			if(a[i]==a[j]) {
				c++;
				visited[j]=true;
				
			}
		}
        System.out.println("Num" + a[i] +" occurs " + c );
		}
				
		

	}

}
