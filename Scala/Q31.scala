abstract class Bank{
    def getBalance():Unit={};
}
class A(a:Int) extends Bank{
    def getBalance():Unit={
        println("Balance of A:"+a);
    }
}
class B(a:Int) extends Bank{
    def getBalance():Unit={
        println("Balance of B:"+a);
    }
}
class C(a:Int) extends Bank{
    def getBalance():Unit={
        println("Balance of C:"+a);
    }
}
object MyClass {
    def main(args: Array[String]): Unit ={
        
        var x=new A(100);
        var y=new B(150);
        var z=new C(200);
        x.getBalance();
        y.getBalance();
        z.getBalance();
    }
}