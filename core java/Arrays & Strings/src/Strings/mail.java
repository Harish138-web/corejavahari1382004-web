
package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class mail {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[] a=new String [s.nextInt()];
	s.nextLine();
	
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextLine();
		
	}
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i].endsWith("@gmail.com")) {
			a[i]=a[i].replaceAll("@gmail.com","@yahoo.com");
			count++;
		}
	}
	System.out.println(count);
	System.out.println(Arrays.toString(a));
}
}
