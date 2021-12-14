package com.ingenuity.assignment1;

import java.util.Scanner;

public class CommandLineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println();
        String[] arr = str.split(" ");
        System.out.println(arr.length);
        for (String word:
             arr) {
            System.out.println(word);
        }
   }
}
//gsytec@gmail.com// TODO this I have to do using diff methods