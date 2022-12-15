import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
abstract class Employee {
    var name = ""
    var title = ""
    def calculateWeeklyPay()
    def setName() {
        print("Enter name : ")
        name = readLine()
    }
    def getName() {
        println("Name of employee is : " + name)
    }
    def setTitle() {
        print("Enter title : ")
        title = readLine()
    }
    def getTitle() {
        println("Title of employee is : " + title)
    }
}
class HourlyEmployee extends Employee {
    var hours = 0
    var rate = 0
    def setHours() {
        print("Enter hours : ")
        hours = readInt()
    }
    def setRate() {
        print("Enter rate : ")
        rate = readInt()
    }
    def calculateWeeklyPay() {
        println("Weekly salary of employee is : " + (hours * rate))
    }
}
class SalaryEmployee extends Employee {
    var salary = 0
    def setSalary() {
        print("Enter salary : ")
        salary = readInt()
    }
    def calculateWeeklyPay() {
        println("Weekly salary of employee is : " + salary)
    }
}
object Main {
    def main(args: Array[String]): Unit = {
        var h = new HourlyEmployee;
        var s = new SalaryEmployee();
        h.setName()
        h.setTitle()
        h.setHours()
        h.setRate()
        h.calculateWeeklyPay()
        s.setName()
        s.setTitle()
        s.setSalary()
        s.calculateWeeklyPay()
    }
}