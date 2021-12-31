package com.ingenuity.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("Shahrukh");
        lst.add("Yasar");
        lst.add("Sidra");

//        System.out.println(lst.peek());
//        System.out.println(lst.poll());
//        System.out.println(lst);

        Iterator i = lst.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
