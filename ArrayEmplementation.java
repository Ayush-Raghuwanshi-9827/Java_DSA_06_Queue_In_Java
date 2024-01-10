package QueueJava;

public class ArrayEmplementation {
    public static class QueueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        // Function that add element in array
        public void add(int val){
            if(r == arr.length) {
                System.out.println("Queue is full");
                return;
            }
            if(f == -1) {
                f = r = 0;
                arr[r] = val; 
            } else {
               arr[r] = val;
            }
            size++;
            r++;
        }

        // Function that remove element from the array
        public int remove(){
            if(size == 0) {
                System.out.println("Queue is empty !");
                return -1;
            } 
            f++;
            return arr[f-1];
        }

        // Function that gives the peek element form the array
        int peek(){
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        // Function that gives the size of the Queue
        public int Size(){
            return size;
        } 

        // Function that display all the element from the Queue Array
        public void Display(){
            if (size == 0) {
                System.out.println("Queue is empty");
            }else {
                for(int i =f; i < r; i++){
                  System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        QueueA t = new QueueA();
        t.add(4);
        t.add(88);
        t.add(2);
        t.add(9);
        t.add(8);
        t.Display();
        // System.out.println(t.Size());
        t.remove();
        t.Display();
        t.remove();
        t.Display();
        t.add(33);
        // System.out.println(t.peek());
    }
}
