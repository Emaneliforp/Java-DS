package Lecture4;

public class LinkedList implements StringList {
    int size;
    Node head;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void push(Node n){
        n.next = this.head;
        this.head = n;
        this.size++;
    };
    public Node pop(){
        if(size == 0) return null;
        Node first = this.head;
        this.head = this.head.next;
        this.size--;
        return first;
    };

    public void queue(Node n){
        n.next = this.head;
        this.head = n;
        this.size++;
    }
    public String dequeue(){
        if(size == 0) return null;

        Node prev = null;
        Node curr = this.head;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null)
            this.head = null;
        else
            prev.next = null;
        this.size--;
        return curr.value;
    }

    public String get(int index){
        // recipe1:
        // head: [chili] -> [chicken] -> [rice] -> [null] -> null
        // size: 3
        // recipe1.get(5)
        // curr: null
        // i: 4
        int i = 0;
        Node curr = this.head;
        while(i < index && curr.next != null){
            curr = curr.next;
            i++;
        }
        return curr.value;
    };
    public int size(){
        return this.size;
    };
}
