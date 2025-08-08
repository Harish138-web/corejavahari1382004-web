package Strings;

import java.util.Stack;

public class RemoveDuplicateAdjacent {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch: st) { 
            sb.append(ch);
        }

        System.out.println(sb);  
    }
}

