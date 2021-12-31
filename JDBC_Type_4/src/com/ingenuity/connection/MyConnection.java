package com.ingenuity.connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection{
    static Connection conn;
    public static Connection getConnection(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
        }catch (Exception e){
            System.out.println("exception : "+e);
        }
        return conn;
    }

}
