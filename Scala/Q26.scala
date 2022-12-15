//26.	Write a function to find the values of following series: -Value=a+a2/2! +a3/3! +a4+4!................an/n! (use passing function as parameter to another function)


import scala.io.StdIn._
object MyClass { 
    def function(a:Int,n:Int,f:Int=>Int):Double={
        if(n==1)
        a
        else
        {
            var m=Math.pow(a,n)/f(n)
            m+function(a,n-1,f)
        }
    }
    def fact(a:Int):Int={
        if(a==1)
        1
        else 
        a*fact(a-1)
    }
    def main(args: Array[String]) { 
        println("Enter a: ");
        var x=readInt();
        println("Enter n: ");
        var y=readInt();
        println("Value is: "+function(x,y,fact))
    } 
}