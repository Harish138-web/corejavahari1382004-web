package Strings;
import java.util.*;

public class reverse {
public static void main(String[] args) {
//	String str ="Hariaj138@gmail.com";
//	StringBuffer sb=new StringBuffer(str);
//    sb.reverse();
//    System.out.println(sb);
//	String st1r="moc.liamg@831jairaH";
//	System.out.println(sb.equals(st1r));
//	for(int i=str.length()-1;i>=0;i--)
//{
//	System.out.print(str.charAt(i));
//	
//}
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a1");
	String[] a1=new  String[s.nextInt()];
	s.nextLine();
	for(int i=0;i<a1.length;i++) {
		a1[i]=s.nextLine();
		
		
	}
	System.out.println(Arrays.toString(a1));
	System.out.println("Enter a2");
	String[] a2=new  String[s.nextInt()];
	s.nextLine();
	for(int i=0;i<a2.length;i++) {
		a2[i]=s.nextLine();
		
		
	}
	System.out.println(Arrays.toString(a2));

	}
}