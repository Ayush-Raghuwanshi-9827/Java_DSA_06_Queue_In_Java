package QueueJava;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    // To display all the emelent in the queue with no extra space
    public static Queue<Integer> printElementInQueue(Queue<Integer> t){
        int n = t.size();
        for(int i = 0; i < n; i++){
            System.out.print(t.element() + " ");
            t.add(t.poll());  
        }
        System.out.println();
        return t;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        // System.out.println(q);
        // System.out.println("Size : " + q.size());
        // q.remove();
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // System.out.println(q.element());
        // System.out.println(q);
        printElementInQueue(q);
        System.out.println(q);

    }
}
