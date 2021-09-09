package Lecture2;

abstract class AbstractStringList implements StringList{
    String value;
    int size;

    public void add(String s){
        System.out.println("hello");
    };
    public String get(int index){
        return "hello";
    }
    public int size(){
        return 0;
    };

    public void print(){
        System.out.println("hello");
    }
}
