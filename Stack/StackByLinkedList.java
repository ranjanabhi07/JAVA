public class StackByLinkedList {
    // Node class
    static class Node{
        public Node next;
        public int value;
        Node(int value){
            this.next = null;
            this.value = value;
        }

        // Stack class
    static class Stack{
        public static Node head = null;
        public static int size;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int value){
            Node newNode = new Node(value);
            if(isEmpty()){
                head = newNode;
                newNode.next=null;
                size++;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }
            
        
        public static void print(){
            Node current = head;
            while(current != null){
                System.out.print(current.value+" -> ");
                current = current.next;
            }
            System.out.print("null");
        }    
        }
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.print();
        }
    }
}
