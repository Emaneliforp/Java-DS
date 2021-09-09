package Lecture3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testNode(){
        Node n1 = new Node("chicken");
        assertEquals("chicken", n1.value);
        assertEquals(null, n1.next);

        Node n2 = new Node("rice", n1);
        assertEquals("rice", n2.value);
        // n2.next = n1
        assertEquals("chicken", n2.next.value); // n1.value
        n1.next = n2;
        assertEquals("rice", n2.next.next.next.next.value); // n1.value
    }
    @Test
    public void testEmptyLinkedList(){
        LinkedList recipe1 = new LinkedList();
        assertEquals(0, recipe1.size);
    }
    @Test
    public void testPrepend(){
        LinkedList recipe1 = new LinkedList();
        Node n1 = new Node("rice");
        recipe1.prepend(n1);
        assertEquals(1, recipe1.size);
        assertEquals("rice", recipe1.head.value);
    }
    @Test
    public void testGetOneItem(){
        LinkedList recipe1 = new LinkedList();
        Node n1 = new Node("rice");
        recipe1.prepend(n1);
        assertEquals(1, recipe1.size);
        assertEquals("rice", recipe1.get(0));
    }
    @Test
    public void testGetMultipleItem(){
        LinkedList recipe1 = new LinkedList();
        Node n1 = new Node("rice");
        Node n2 = new Node("chicken");
        Node n3 = new Node("chili");
        recipe1.prepend(n1);
        recipe1.prepend(n2);
        recipe1.prepend(n3);
        assertEquals(3, recipe1.size);
        assertEquals("rice", recipe1.get(2));
    }
    @Test
    public void testGetOutBound(){
        LinkedList recipe1 = new LinkedList();
        assertEquals(null, recipe1.get(2));
    }
    @Test
    public void testRemoveMultipleItem(){
        LinkedList recipe1 = new LinkedList();
        Node n1 = new Node("rice");
        Node n2 = new Node("chicken");
        Node n3 = new Node("chili");
        recipe1.prepend(n1);
        recipe1.prepend(n2);
        recipe1.prepend(n3);
        recipe1.remove();
        assertEquals(2, recipe1.size);
        assertEquals("chicken", recipe1.get(0));
    }
    @Test
    public void testRemoveEmpty(){
        LinkedList recipe1 = new LinkedList();
        recipe1.remove();
        assertEquals(0, recipe1.size);
        assertEquals(null, recipe1.get(0));
    }
}
