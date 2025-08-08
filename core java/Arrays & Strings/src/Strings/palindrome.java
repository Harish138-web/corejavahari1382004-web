package Strings;
import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[]a=new String[s.nextInt()];
	s.nextLine();
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextLine();
		}
	for(int i=0;i<a.length;i++) {
		a[i]=a[i].replaceAll("[^a-zA-Z0-9]","");
		a[i]=a[i].toLowerCase();
		}
	String rev="";
    for(int i=a.length-1;i>=0;i--) {
    	rev=rev+a[i];
    }
    System.out.println(rev);
	
}
}
