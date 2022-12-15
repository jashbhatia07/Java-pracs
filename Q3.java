//3.	Implement a java program to calculate gross salary and net salary taking the following data. 
//Input: empno, empname, basic 
//Process  
//DA=70% of basic 
//HRA=30% of basic 
//CCA= Rs. 240/- 
//PF=10% of basic 
//PT=Rs.100/- 

import java.util.*;

class Salary {

    public static void main(String[] args) {
        int empno;
        float basic, gross, net;
        String empname;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Number: ");
        empno = s.nextInt();
        System.out.println("Enter Employee Name: ");
        empname = s.next();
        System.out.println("Enter Basic Salary:");
        basic =  s.nextFloat();

        int cca = 240, pt = 100;
        float da = 0.7f * basic;
        float hra = 0.3f * basic;
        float pf = 0.1f * basic;

        gross = basic + da + hra + cca;
        net = gross - pt - pf;
        System.out.println("Employee Number:" + empno);
        System.out.println("Employee Name:" + empname);
        System.out.println("Basic Salary" + basic);
        System.out.println("Gross Salary:" + gross);
        System.out.println("Net Salary:" + net);
    }
}