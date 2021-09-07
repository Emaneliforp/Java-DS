package Lectures.Inheritance;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{
    int width;
    int length;

    Rectangle(){
        super();
        this.width = 0;
        this.length = 0;
    }
    Rectangle(String color, int width, int length){
        super("Rectangle", 4, color);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString(){
        return "name: " + super.name + "\ncorner: " + super.corner +"\ncolor: " + super.color
                + "\nwidth: " + this.width + "\nlength: " + this.length;
    }
    public void print(){
        System.out.println(this.toString());
    }
    public int area(){
        return this.width * this.length;
    }

    public static void main(String[] args){
        Rectangle s1 = new Rectangle("blue", 3, 5);
        //s1.print();
        //System.out.println(s1.area());

        Shape s3 = new Shape("Circle", 0, "green");
        //System.out.println(s3.width);

        Shape s2 = new Rectangle("yellow", 2, 4);
        Rectangle reals2 = (Rectangle) s2;
        //System.out.println(s1.width);
        System.out.println(reals2.width);
    }
}
