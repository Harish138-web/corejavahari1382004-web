package Strings;

public class roman {
	static int getValue(char ch)
	{
		switch(ch) {
		case'I':return 1;
		case'V':return 5;
		case'X':return 10;
		case'L':return 50;
		case'C':return 100;
		case'D':return 500;
		case'M':return 1000;
		default:return 0;
		}
		
	}
	public static void main(String[] args) {
		String str="VI";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(i+1<str.length()&& getValue(str.charAt(i))<getValue(str.charAt(i+1))) {
				sum=sum-getValue(str.charAt(i));
			}
			else {
				sum=sum+getValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
