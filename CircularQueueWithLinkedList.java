package QueueJava;

public class CircularQueueWithLinkedList {
    public static class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public static class CQL {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Function that add a element in the LinkedList
        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }

        // Function that remove the element form the Queue
        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                int x = head.val;
                head = head.next;
                tail.next = head;
                return x;
            }
        }

        // Function that return the top element
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            return head.val;
        }

        // Funtion that display all the element in the LinkedList Queue
        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while (temp != tail.next) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CQL a = new CQL();
        a.add(2);
        a.add(3);
        a.add(4);
        a.display();

    }
}
