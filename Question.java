package QueueJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question {
    // for input - [1, 2, 3, 4, 5, 6, 7, 8]
    // Output will be - [1, 5, 2, 6, 3, 7, 4, 8]
    public static void ReorderQueueUsingStack(Queue<Integer> q, int n){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i < n/2; i++){
            st.push(q.poll());
        }
        for(int i=0; i < n/2; i++){
            q.add(st.pop());
        }
        for(int i=0; i < n/2; i++){
           st.push(q.poll());
        }
        for(int i=0; i< n/2; i++){
            if(st.size() > 0){
                q.add(st.pop());
            }
            q.add(q.poll());
        }
        for(int i=0; i < n; i++){
            st.push(q.poll());
        }
        for(int i=0; i < n; i++){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       for(int i=1; i <= 8; i++){
          q.add(i);
       }
       System.out.println(q);
       ReorderQueueUsingStack(q, 8);
       System.out.println(q);
    }
}
