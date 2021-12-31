package com.ingenuity.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(5);
        ts.add(2);
        ts.add(1);
        ts.add(0);
//        ts.add(null);
        System.out.println(ts);
        Iterator i = ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
