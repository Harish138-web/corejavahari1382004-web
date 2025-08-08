package Strings;

public class LengthOfLongestSubString {
	public static void main(String[] args) {
		String s ="zbcadxazb";
		
		for(int i=0;i<s.length();i++) {
			int c=0;
			for(int j=i;j<s.length()-1;j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					c++;
				}
			}
			
		
		
		System.out.println(c);
	}
}

}
