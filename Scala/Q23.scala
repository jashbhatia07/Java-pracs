//23.	Create a class named 'Member' having the following members: 

//Data members 
//1 - Name 
//2 - Age 
//3 - Phone number 
//4 - Address 
//5 – Salary 
 //It also has a method named 'printSalary' which prints the salary of the members. 
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.


import scala.io.StdIn._
class Member {
    var name = ""
    var age = 0
    var number = ""
    var address = ""
    var salary = 0
    def getInfo() {
        print("Enter name : ")
        name = readLine()
        print("Enter age : ")
        age = readInt()
        print("Enter number : ")
        number = readLine()
        print("Enter address : ")
        address = readLine()
        print("Enter salary : ")
        salary = readInt()
    }
    def showInfo() {
        println("Name is " + name)
        println("Age is " + age)
        println("Number is " + number)
        println("Address is " + address)
        println("Salary is " + salary)
    }
}
class Employee extends Member {
    var specialization = ""
    var department = ""
    override def getInfo() {
        super.getInfo
        print("Enter specialization : ")
        specialization = readLine()
        print("Enter department : ")
        department = readLine()
    }
    override def showInfo() {
        super.showInfo
        println("Specialization is " + specialization)
        println("Department is " + department)
    }
}
class Manager extends Member {
    var specialization = ""
    var department = ""
    override def getInfo() {
        super.getInfo
        print("Enter specialization : ")
        specialization = readLine()
        print("Enter department : ")
        department = readLine()
    }
    override def showInfo() {
        super.showInfo
        println("Specialization is " + specialization)
        println("Department is " + department)
    }
}
object Main {
    def main(args: Array[String]) {
        var e = new Employee();
        e.getInfo();
        e.showInfo();
        var m = new Manager();
        m.getInfo();
        m.showInfo();
    }
}