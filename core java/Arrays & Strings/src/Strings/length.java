package Strings;
import java.util.Scanner;
public class length {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
	    str = str.trim();
	    if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1);
        }

	    int num=str.lastIndexOf(' ');
	    int length= (str.length()-num-1);
	    System.out.println(length);
	}

}
