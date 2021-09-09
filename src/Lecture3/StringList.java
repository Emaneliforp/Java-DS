package Lecture3;

public interface StringList {
    void prepend(Node n); //push() add to the first node
    String get(int i);
    int size();
    String remove(); //pop() return first node
}

