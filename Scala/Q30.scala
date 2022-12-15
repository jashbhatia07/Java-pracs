//30.	We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. 


abstract class Marks{
    def getPercentage()
}
class A(a:Int,b:Int,c:Int) extends Marks{
    def getPercentage(){
        println("Percentage of A: "+(a+b+c)/3+"%");
    }
}
class B(a:Int,b:Int,c:Int,d:Int) extends Marks{
    def getPercentage(){
        println("Percentage of A: "+(a+b+c+d)/4+"%");
    }
}
object MyClass {
    def main(args: Array[String]) {
        var x=new A(88,90,100);
        var y=new B(90,91,92,80);
        x.getPercentage();
        y.getPercentage();
    }
}