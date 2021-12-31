package com.ingenuity.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Example {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("hell");
        ls.add("heaven");
        ls.add("hell");
        System.out.println(ls.size());
        System.out.println(ls.remove("hell"));
        Iterator i = ls.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
