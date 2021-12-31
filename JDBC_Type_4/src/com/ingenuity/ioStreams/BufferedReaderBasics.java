package com.ingenuity.ioStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderBasics {
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
