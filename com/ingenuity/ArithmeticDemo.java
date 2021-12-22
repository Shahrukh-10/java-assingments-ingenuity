package com.ingenuity;
  abstract class Arithmetic1{
    public abstract int addition( int firstNo, int secondNo );
    public abstract int addition( int firstNo, int secondNo, int thridNo );
    public abstract int addition( double firstNo, double secondNo );
    public abstract int addition( int firstNo, double secondNo );
    public abstract float addition( float firstNo, float secondNo, float thirdNo);
}
class ArithmeticImpl extends Arithmetic1{
    public int addition( int firstNo, int secondNo ){
        return firstNo+secondNo;
    }
    public int addition( int firstNo, int secondNo, int thridNo ){
        return firstNo+secondNo+thridNo;
    }
    public int addition( double firstNo, double secondNo ){
        Double first = firstNo;
        int a= first.intValue();
        Double second = secondNo;
        int b = second.intValue();
        return  a+b;
    }
    public int addition( int firstNo, double secondNo ){
        Double second = secondNo;
        int b = second.intValue();
        return firstNo+b;
    }
    public float addition( float firstNo, float secondNo, float thirdNo){
        return firstNo+secondNo+thirdNo;
    }
}
public class ArithmeticDemo {
    public static void main(String[] args) {
     ArithmeticImpl a= new ArithmeticImpl();
        System.out.println( a.addition(2,4));
        System.out.println( a.addition(1,3,4));
        System.out.println(  a.addition(2.4,4.5));
        System.out.println(a.addition(4,5.8));
        System.out.println(a.addition(4.55f,5.44f,5.23f));
    }
}
