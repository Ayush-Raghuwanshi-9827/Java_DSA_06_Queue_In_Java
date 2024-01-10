package QueueJava;

import java.util.Stack;

public class ArrayQuestion {
    public static String reverseWords(String S)
    {
        // code here 
        Stack<Character> st = new Stack<>();
        int n = S.length();
        String m = "";
        for(int i = n-1; i >= 0; i--){
            char ch = S.charAt(i);
            if(ch != '.'){
                st.push(ch);
            }
            else if(ch == '.'){
                while(st.size() !=0){
                    m += st.pop();
                }
                m += ".";
            }
            if(i ==0){
                while(st.size() != 0){
                    m += st.pop();
                }
            }
            
        }
        return m;
    }

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        String res = reverseWords(S);
        System.out.println(res);
    }
}
