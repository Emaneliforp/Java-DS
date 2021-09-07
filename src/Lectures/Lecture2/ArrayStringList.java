package Lectures.Lecture2;

public class ArrayStringList implements StringList{
    // properties
    String[] elements;
    int size;

    // constructors
    ArrayStringList(){
        this.elements = new String[2];
        this.size = 0;
    }
    ArrayStringList(int capacity){
        this.elements = new String[capacity];
        size = 0;
    }

    // behaviors
    public void expandCapacity(){
        if(this.size < this.elements.length){
            return;
        }
        String[] expanded = new String[this.elements.length * 2];
        for(int i = 0; i < this.elements.length; i++){
            expanded[i] = this.elements[i];
        }
        this.elements = expanded;
    }

    public void add(String s){
        expandCapacity();
        this.elements[size] = s;
        this.size += 1;
    }

    public String get(int index){
        return this.elements[index];
    }

    public int size(){
        return this.size;
    }
    // what is the bug? length is fixed
    // public void pop(){}

    public static void main(String[] args){
        ArrayStringList arr = new ArrayStringList();
        //arr.elements = new String[2];
        //arr.elements = ["apple", "banana"]
        //arr.size = 2;
        arr.add("apple");
        arr.add("banana");
        arr.add("orange");
        arr.add("apple");
        System.out.println(arr.get(0));
        System.out.println(arr.elements.length);

        StringList arr1 = new ArrayStringList();
    }
}
