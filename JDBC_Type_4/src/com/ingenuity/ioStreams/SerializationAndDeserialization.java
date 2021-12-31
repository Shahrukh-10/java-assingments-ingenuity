package com.ingenuity.ioStreams;

import java.io.*;

public class SerializationAndDeserialization {
    public static void main(String[] args) {
        try {
            //Serialization
            MyClass obj = new MyClass("Shahrukh ....");
//            MyClass obj = new MyClass();
//            System.out.println( obj);
            FileOutputStream fos = new FileOutputStream("/home/shahrukh/IdeaProjects/JDBC_Type_4/src/com/ingenuity/ioStreams/out.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(obj);
            os.flush();
            System.out.println("Printed ...");

        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            // deserialization
            FileInputStream fis = new FileInputStream("/home/shahrukh/IdeaProjects/JDBC_Type_4/src/com/ingenuity/ioStreams/out.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyClass  a = (MyClass) ois.readObject();
            a.st();
            System.out.println(a.name);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

class MyClass implements Serializable {
    String name ;
    MyClass(String name){
        this.name = name;
    }
    public void st(){
        System.out.println("dfjsdkfjjhdigh");
    }

}
