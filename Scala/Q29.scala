import scala.io.StdIn._
abstract class Shape{ 
    def RectangleArea(a:Int,b:Int) 
    def SquareArea(s:Int) 
    def CircleArea(r:Int) } 
class Area extends Shape{ 
    def RectangleArea(a:Int,b:Int){ 
        println("Area of Rectangle: "+a*b) 
    } 
    def SquareArea(s:Int){ 
        println("Area of Square: "+s*s) 
    } 
    def CircleArea(r:Int){ 
        println("Area of Circle: "+3.14*r*r) 
    }
} 
object MyClass { 
    def main(args: Array[String]) { 
        var a=new Area; 
        println("Enter length and Breadth: ");
        var x=scala.io.StdIn.readInt();
        var y=scala.io.StdIn.readInt();
        a.RectangleArea(x,y);
        println("Enter side: ");
        var s=scala.io.StdIn.readInt();
        a.SquareArea(s) 
        println("Enter radius: ");
        var r=scala.io.StdIn.readInt();
        a.CircleArea(r) 
        
    } 
}