package Arrays;

import java.util.HashSet;

public class PanagramOrNot {
	public static void main(String[] args) {
		String str1=" The quick brown fox jumps over the lazy dog";
		str1=str1.toLowerCase();
		HashSet hs =new HashSet();
		for(char ch:str1.toCharArray()) {
			if(ch>='a'&& ch<='z') {
				hs.add(ch);
				
			}
		}
		if(hs.size()==26) {
			System.out.println("Panagram");
		}
		else System.out.println("Not a Panagram");
	}

}
