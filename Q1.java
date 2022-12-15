//1.	A shop will give discount of 10% if the cost of purchased quantity is more than 1000. 
//Ask user for quantity 
//Suppose, one unit will cost 100. 
//Judge and print total cost for u 

import java.util.*;
//import java.lang.*;
//import java.io.*;

class shop_discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( "Enter the quantity : ");
        int quantity = s.nextInt();
        final int cost = 100;
        final int discounted_cost = 90;

        if(quantity<1000){
            System.out.println("The final cost is : " + quantity*cost);
        }else{
            System.out.println("The final cost is : " + quantity*discounted_cost);
        }
        s.close();
        }
    
}