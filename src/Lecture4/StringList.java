package Lecture4;

public interface StringList {
    // void push(Node n); //push() add to the first node
    // String pop(); //pop() return first node

    void queue(Node n);
    String dequeue();

    String get(int i);
    int size();
}

