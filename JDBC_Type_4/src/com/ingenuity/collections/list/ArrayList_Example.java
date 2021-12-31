package com.ingenuity.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Shahrukh");
        arr.add("Messsi");
        arr.add("Abdullah");
        System.out.println(arr);

        Iterator i = arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next().toString());
        }
    }
}
