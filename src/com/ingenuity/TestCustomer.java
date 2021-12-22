package com.ingenuity;

import java.util.Scanner;

class InvalidInputException extends Exception {

    public InvalidInputException(String s) {
     super(s);
    }
}
class Customer{
    private String custNo;

    private String custName;

    private String category;

    public Customer(String custNo, String custName, String category) throws InvalidInputException {
        if (custNo.charAt(0)== 'C' || custNo.charAt(0)=='c') {
            this.custNo = custNo;


        }else{
            throw new InvalidInputException(" cannot satrt with c");
       }

          if (custName.length()<4) {
            throw new InvalidInputException(" cannot min 4 lenght required");
        }else{
        this.custName = custName;}
        if (category.equals("Plantinum") || category.equals("Gold") || category.equals("Silver") ) {
            this.category = category;

        }else{
            throw new InvalidInputException("category must be silver or gold or plantinum");
        }
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
public class TestCustomer {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the cust no");
        String custno= sc.next();

        System.out.println("enter the cust name");
        String custname= sc.next();
        System.out.println("enter the category");
        String category= sc.next();
try{
    Customer c = new Customer( custno,custname,category);


}catch (Exception e){
    System.out.println(e);
}

    }

}
