package QueueJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterwiewQuestion {
    public static void ReverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int size = q.size();
        for(int i=1; i <= size; i++){
            st.push(q.remove());
        }
        for(int i = 1; i <= size; i++){
            q.add(st.pop());
        }
    }
    //  Function that reverse numbers through k numbers
     public static void ReverseQueueK(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        for(int i=1; i <= k; i++){
            st.push(q.remove());
        }
        for(int i=1; i <= k; i++){
            q.add(st.pop());
        }
        int n = q.size() - k;
        for(int i = 1; i <= n; i++){
           q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        ReverseQueueK(q, 3);
        System.out.println(q);


    }
}
