package Strings;

public class CountStrings {
	public static void main(String[] args) {
		String str="aabbbbeeeeffff";
	//a2b4e4f4
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1))
		{
			count++;
		}
		else {
			System.out.print(Character.toString(str.charAt(i-1))+count);
			count =1;
		}
		}
		
		
}

}


