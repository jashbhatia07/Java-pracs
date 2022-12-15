//31.	We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object of the two classes and print the percentage of marks for both the students. 

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