package LinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int count;

    public Node sll(int value){
        head = new Node();
        Node newNode = new Node();
        newNode.next=null;
        newNode.value=value;
        head = newNode;
        tail = newNode;
        count =1;
        return head;
    }
}
