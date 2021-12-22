package com.ingenuity;

public class Exception_handling {
    public static void main(String[] args) {
        int[] arr= new int[10];
        try {
            System.out.println(arr[11]);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("doesn't cause abnormal termination of program.");
        }
    }
}
