package Strings;
import java.util.Scanner;
public class split {

public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	String a[]=new String[s.nextInt()];
	s.nextLine();
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextLine();
	}
	for (int k=0;k<a.length;k++) {
	 String b[]=a[k].split(" ");
	 int i=0;
	 int j=b.length-1;
	 while(i<j) {
		 String temp= b[i];
		 b[i]=b[j];
		 b[j]=temp;
		 i++;
		 j--;
	 }
	String str=String.join("  ", b);
	System.out.println(str);
	
	}
}
}
