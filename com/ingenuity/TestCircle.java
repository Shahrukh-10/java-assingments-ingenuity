package com.ingenuity;



interface GeometryConstant{
    double PI = 3.142;
}

interface GeometryMethod {
   void calArea (double radius );

  void calCircumference ( double radius );
}
class Circle1 implements GeometryConstant ,GeometryMethod{


    public void calArea(double radius) {
        System.out.println( PI* radius*radius);
    }


    public void calCircumference(double radius) {
        System.out.println(2*PI*radius);
    }
}
public class TestCircle {
    public static void main(String[] args) {


    Circle1 c= new Circle1();
    c.calArea(5.0);
    c.calCircumference(4.9);
    }
}

/*  QUESTION 5-----------------------------------------------------------------------------
interface GeometryConstant{
    double PI = 3.142;
}


interface GeometryMethod extends GeometryConstant {
    void calArea (double radius );

    void calCircumference ( double radius );
}


class Circle1 implements GeometryConstant ,GeometryMethod{


    public void calArea(double radius) {
        System.out.println( PI* radius*radius);
    }


    public void calCircumference(double radius) {
        System.out.println(2*PI*radius);
    }
}
public class TestCircle {
    public static void main(String[] args) {


        Circle1 c= new Circle1();
        c.calArea(5.0);
        c.calCircumference(4.9);
    }
}
*/