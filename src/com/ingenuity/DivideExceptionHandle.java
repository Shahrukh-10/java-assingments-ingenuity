package com.ingenuity;

import java.util.Scanner;
public class DivideExceptionHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first num ");
        int numerator = sc.nextInt();
        System.out.print("Please enter second num");
        int denominator = sc.nextInt();
        try {
            divide(numerator, denominator);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("handled");
        }
    }
    public static void divide(int a, int b){

            int result = a/b;
            System.out.println( +result);

    }
}