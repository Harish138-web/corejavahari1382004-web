package Arrays;

import java.util.ArrayList;

public class prefixSum {
public static void main(String[] args) {
	int[] a= {5,1,4,9,2,7,7};
	ArrayList<Integer> prefixSum = new ArrayList<>();
	int val=0;
	int k=22;
	prefixSum.add(val);
	for(int i:a) {
		val+=val+i;
		prefixSum.add(val);
		if(prefixSum.contains(val-k));{
			System.out.println("Element is Present");
			return;
			
		}


		
	}
	System.out.println("Element is not present");
	
}
}
