package com.ingenuity.collections.hashMap;

import java.util.TreeMap;

public class Treemap_Example {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(1,0);
        tm.put(3,0);
        tm.put(2,0);
        System.out.println(tm);

        int arr[] = {1,1,1,1,2,2,2,3,3,3};
        for (int i : arr){
            if (tm.containsKey(i)){
                tm.put(i,tm.get(i)+1);
            }
        }
        System.out.println(tm);
    }
}
