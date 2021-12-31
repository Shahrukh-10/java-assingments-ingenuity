package com.ingenuity.collections.hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap_Example {
    public static void main(String[] args) {
        HashMap<Integer ,Integer > hs = new HashMap<>();
        hs.put(1,0);
        hs.put(2,0);
        hs.put(3,0);
        System.out.println(hs);

        int arr[] = {1,1,1,1,2,2,2,3,3,3};
        for (int i : arr){
            if (hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
        }
        System.out.println(hs);
    }
}
