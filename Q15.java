//15.	Write a Java Program to calculate the Result. Result should consist of name, seatno, date, center number and marks of semester three  exam. Create a User Defined Exception class MarksOutOfBoundsException, If Entered marks of any subject is greater than 100 or less than    0,    and    then    program    should    create    a    user    defined    Exception    of    type MarksOutOfBoundsException and must have a provision to handle it

import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String s) {
        super(s);
    }
}

public class Q15 {
    
}