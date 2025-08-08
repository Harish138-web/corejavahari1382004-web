package Strings;

public class Tranformation {
	public static void main(String[] args) {
		String str1="zbax";
		String str2="";
		int k=2;
		for(char ch:str1.toCharArray()){
		str2 +=Integer.toString(ch-'a'+1);	
		}
		System.out.println(str2);
		while(k>0) {
		int sum=0;
		for(char ch : str2.toCharArray()) {
			 sum=sum+(ch-'0');
			
		}
		str2 = Integer.toString(sum);
		k--;
		
		}
		System.out.println(str2);
	}
	

}
