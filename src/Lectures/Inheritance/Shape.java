package Lectures.Inheritance;

public class Shape {
    String name;
    int corner;
    String color;

    Shape(){
        this.name = "unknown";
        this.corner = 0;
        this.color = "white";
    }

    Shape(String name, int corner, String color){
        this.name = name;
        this.corner = corner;
        this.color = color;
    }

    public String toString(){
        return "name: " + this.name + "\ncorner: " + this.corner +"\ncolor: " + this.color;
    }
}
