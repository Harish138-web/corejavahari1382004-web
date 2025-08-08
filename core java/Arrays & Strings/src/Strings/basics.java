package Strings;

public class basics {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Harish");
		System.out.println(sb);
		sb.append(" harish.S");
		System.out.println(sb);
		sb.insert(7,"great ");
		System.out.println(sb);
		sb.setCharAt(12,'-');
		System.out.println(sb);
		sb.setCharAt(13,'H');
		System.out.println(sb);
		sb.delete(7,13);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
