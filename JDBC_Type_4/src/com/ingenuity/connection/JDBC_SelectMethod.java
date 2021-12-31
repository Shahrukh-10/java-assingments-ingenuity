package com.ingenuity.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_SelectMethod {

    Statement stmt ;
    ResultSet rs ;
    public JDBC_SelectMethod(){
        try {
            Connection con = MyConnection.getConnection();
            System.out.println("Connection Established :) ....");

            System.out.println("1");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Employee");
            System.out.println("Statement Created ....");
            while (rs.next()){
            System.out.println("2");
                System.out.println("Employee id "+rs.getInt(1));
                System.out.println("Employee name "+rs.getString(2));
                System.out.println("Employee location "+rs.getString(3));
                System.out.println("Employee phone "+rs.getString(4));
                System.out.println("Employee salary "+rs.getString(5));
            }
            stmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
	// write your code here
    new JDBC_SelectMethod();

    }
}
