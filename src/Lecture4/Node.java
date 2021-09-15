package Lecture4;

public class Node{
    String value;
    Node next;

    public Node(String value){
        this.value = value;
        this.next = null;
    }
    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }
    public static void main(String[]args){
        Node n1 = new Node("abC");
        Node n2 = new Node("Klay", n1);
        //LinkedList: [val: "Klay"] -> [val: "abC"]
    }
}
