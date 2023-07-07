public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int value){
        head = new Node();
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size++;
    }

    public void insertLL(int value, int location){
        Node newNode = new Node();
        newNode.value = value;
        if(head == null){
            createLL(value);
        } else if(location == 1){
            newNode.next = head;
            head = newNode;
            size++;
        } else if (location >= size){
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
            size++;
        } else {
            Node currentNode = new Node();
            currentNode = head;
            int i=0;
            while(i<location-1){
                currentNode = currentNode.next;
                i++;
            }
            Node temp = currentNode.next;
            currentNode.next = newNode;
            newNode.next = temp;
            size++;
        }
    }

    public void deleteFromAny(int givenSize){
        int a = size;
        Node currentNode = new Node();
        currentNode = head;
        while(a>givenSize+1){
            currentNode = currentNode.next;
            a--;   
        }
        currentNode.next = currentNode.next.next;
        size--;
    }

    public void delete(int givenPosition){
        if(head == null){
            System.out.println("LinkedList doesn't exist");
        } else if(givenPosition == 1) {
            head = head.next;
            size--;
        } else if (givenPosition >= size){
            Node currentNode =head;
            int a=1;
            while(a<size-1){
                currentNode = currentNode.next;
                a++;
            }
            currentNode.next = null;
            tail=currentNode; 
            size--;
        } else {
            Node currentNode =head;
            int a=1;
            while(a<givenPosition-1){
                currentNode = currentNode.next;
                a++;
            }
            currentNode.next = currentNode.next.next;
            size--;
        }
    }
    
    public void Swap(){
        int count =0;
        int i =1;
        Node currentNode = head;
        
        while(i<size && currentNode.value>0){
            if(currentNode.value>0 && currentNode.next.value>0){
                int temp = currentNode.value;
                currentNode.value = currentNode.next.value;
                currentNode.next.value = temp;
                count++;
            } else {
                break;
            }
            currentNode = currentNode.next.next;
            i+=2;
        }
        print((count*2));
    }

    public void print(int size){
        Node currentNode = new Node();
        currentNode = head;
        for(int i=1; i<=size; i++){
            System.out.print(currentNode.value);
            if(i<size){
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }
    }


}
