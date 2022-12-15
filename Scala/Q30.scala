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