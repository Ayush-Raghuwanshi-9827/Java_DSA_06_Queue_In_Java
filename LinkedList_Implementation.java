package QueueJava;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkedList_Implementation {
    public static class  Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueL {
        Node head = null;
        Node tail = null;
        int size = 0;
    
    // Funtion that add element in the LinkedList queue
    public void add(int x){
        Node temp = new Node(x);
        if(size == 0){
          head = tail = temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
        size++;
     }

    //  Function that remove element form the LinkedList Queue
    public int remove(){
        if(size == 0) {
          System.out.println("Queue is Empty");
          return -1;
        }
        int a = head.val;
        head = head.next;
        size--;
        return a;
    }

    // Function that return the top element
    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
        }
        return head.val;
    }

    // Funtion that display all the element in the LinkedList Queue
    public void display(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }else {
            Node temp = head;
            while (temp != tail) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.print(tail.val);
            System.out.println();
        }
    }
     public static void main(String[] args) {
        QueueL t = new QueueL();
        t.add(2);
        t.add(4);
        t.add(55);
        t.display();
        System.out.println(t.size);
        System.out.println(t.remove());
        t.display();
     }
        
    }
}
