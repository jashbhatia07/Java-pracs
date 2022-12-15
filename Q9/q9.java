package Q9;

import java.util.*;

import Q9.Letmecalculate.Calculator;

class Calculations {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers a and b respectively : ");
        a = s.nextInt();
        b = s.nextInt();
        Calculator c = new Calculator();
        System.out.println("The Addition of " + a + " and " + b + " is " + c.add(a, b));
        System.out.println("The Subraction of " + a + " and " + b + " is " + c.sub(a, b));
        System.out.println("The Multiplication of " + a + " and " + b + " is " + c.mul(a,
                b));
        System.out.println("The Division of " + a + " and " + b + " is " + c.div(a, b));
        s.close();
    }
}
