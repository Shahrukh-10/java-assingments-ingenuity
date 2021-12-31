package com.ingenuity.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("1");
        System.out.println(hs);
        Iterator i =hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
