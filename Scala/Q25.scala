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