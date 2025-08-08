package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Prc {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String[]a=new String[s.nextInt()];
	s.nextLine();
    for(int i=0;i<a.length;i++) {
    	a[i]=s.nextLine();
    }
    String rev="";
    for(int i=a.length-1;i>=0;i--) {
    	rev=rev+a[i];
    }
    System.out.println(rev);
	
	
	
}
}
