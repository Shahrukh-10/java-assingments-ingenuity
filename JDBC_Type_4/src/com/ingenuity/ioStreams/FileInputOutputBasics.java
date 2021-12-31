package com.ingenuity.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputBasics {
    public static void main(String[] args)  {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/home/shahrukh/IdeaProjects/JDBC_Type_4/src/com/ingenuity/ioStreams/abc.txt");
            out = new FileOutputStream("/home/shahrukh/IdeaProjects/JDBC_Type_4/src/com/ingenuity/ioStreams/out.txt");
            int c ;
            while ((c = in.read()) != -1 ){
                out.write(c);
            }
            System.out.println("Success");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
            if (in!=null){
            in.close();}
            if (out!=null){
            out.close();}
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
