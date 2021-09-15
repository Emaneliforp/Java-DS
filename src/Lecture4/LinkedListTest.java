package Lecture4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void test(){
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        LinkedList list = new LinkedList();
        list.push(n1);
        list.push(n1);
        list.pop();
        list.push(n3);
        list.push(n2);
        list.push(list.pop());
    }
}
