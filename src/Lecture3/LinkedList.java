package Lecture3;

public class LinkedList implements StringList{
    int size;
    Node head;

    public LinkedList(){
        this.head = new Node(null, null);
        this.size = 0;
    }

    public void prepend(Node n){
        n.next = this.head;
        this.head = n;
        this.size++;
    };
    // traversing
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

    public String remove(){
        if(size == 0) return null;
        Node first = this.head;
        this.head = this.head.next;
        this.size--;
        return first.value;
    };
}
