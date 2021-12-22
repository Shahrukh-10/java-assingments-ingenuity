package com.ingenuity;

import java.util.Scanner;

class Employee{
    private int empNo;

    private String empName;

    private int empBasic ;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }

    public void setEmpBasic(int empBasic) {
        this.empBasic = empBasic;
    }

    @Override
    public String toString() {
        return 
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empBasic=" + empBasic
               ;
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee e= new Employee();
        System.out.println(" enter the employee no");
        int  empno= sc.nextInt();
        e.setEmpNo(empno);
        System.out.println("Enter the name of emplyee");
        String name= sc.next();
        e.setEmpName(name);
        System.out.println("Enter the basis pay");
        int basic= sc.nextInt();
        e.getEmpBasic();
        System.out.println(e.toString());
    }
}
