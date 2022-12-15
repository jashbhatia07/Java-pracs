//25.	Write a recursive function to get the nth Fibonacci number. The first two Fibonacci numbers are 0 and 1. The nth number is always the sum of the previous two—the sequence begins 0, 1, 1, 2, 3, 5.  def fib (n: Int): Int 

import scala.io.StdIn._
object MyClass { 
    def fib(n:Int):Int={
        if(n==0)
        0
        else if(n==1)
        1
        else
           fib(n-1)+fib(n-2)
    }

    def main(args: Array[String]) { 
        println("Enter n: ");
        var y=readInt();
        println(y+"th fibbonaci Number is: "+fib(y-1))
    } 
}