package com.ingenuity;

interface Shape{
    public void draw( );

    public void rotate( );
}
class Circle implements Shape{
    public void draw( ){
        System.out.println("Circle drawn ");
    }
    public void rotate( ){
        System.out.println(" Circle rOTATED ");
    };
}
class Reactangle implements Shape{
    public void draw( ){
        System.out.println("Rectangle drawn ");
    }
    public void rotate( ){
        System.out.println(" Reactangle rOTATED ");
    };
}
public class TestShape {
    public static void main(String[] args) {
        Circle c= new Circle()  ;
        c.draw();
        c.rotate();
        Reactangle r= new Reactangle();
        r.draw();
        r.rotate();
    }

}
