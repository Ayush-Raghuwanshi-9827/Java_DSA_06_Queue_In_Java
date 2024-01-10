package QueueJava;
public class CircularEmplementationWithArray {
    public static class QueueC{
        int f = -1;
        int r = -1;
        int size = 0; 
        int[] arr = new int[5];

        // Function that add element in circular Queue!
        public void add(int x) throws Exception{
             if(size == 0){
               f = r = 0;
               arr[0] = x; 
           }else if(size == arr.length){
                throw new Exception("Queue is Empty!");
            }else if(r < arr.length -1){
               arr[++r] = x;
            }else if(r == arr.length-1){
            r = 0;
            arr[0] = x;
           }
           size++;
        }

        // Function That Remove Element from circular Queue!
        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }else {
                size--;
                int val = arr[f];
                if(f == arr.length -1) f = 0;
                else f++;
                return val;
            }
            
        }

        // function that print top element
        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[f];
        }
         // Function that display all the element in the circular Queue!
         public void display() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }else if (f <= r) {
                for(int i = f; i <= r; i++){
                   System.out.print(arr[i] + " ");
                }
                System.out.println();
            }else {
                for(int i = f; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i =0; i <= r; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
         }

         }
           public static void main(String[] args) throws Exception {
            QueueC a = new QueueC();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);
            a.add(5);
            a.display();
            System.out.println(a.size);
            a.remove();
            a.remove();
            a.add(6);
            a.add(7);
            a.display();
            System.out.println(a.peek());

    }
}
