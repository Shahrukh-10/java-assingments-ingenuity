package com.ingenuity.collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Shahrukh");
        v.add("Dembele");
        v.add("Messi");
        Enumeration<String> player = v.elements();
        while (player.hasMoreElements()){
            System.out.println(player.nextElement());
        }

        Iterator i = v.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
