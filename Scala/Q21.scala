import scala.io.StdIn._
class Employee {
    var empid: Int = 0;
    var empname: String = "";
    var designation: String = "";
    var salary: Int = 0;
    def get_employee() {
        empid = readInt();
        empname = readLine();
        designation = readLine();
        salary = readInt();
    }
    def show_grade() {
        if (salary < 10000) {
            println("D")
        } else if (salary >= 10000 && salary <= 24999) {
            println("C")
        } else if (salary >= 25000 && salary <= 49999) {
            println("B")
        } else if (salary >= 50000) {
            println("A")
        }
    }
    def employee() {
        println("Empid= " + empid + " | EmpName= " + empname + " | designation= " + designation + " | salary= " + salary);
    }
}
object MyClass {
    def main(args: Array[String]) {
        var a = new Employee();
        a.get_employee();
        a.show_grade();
        a.employee();
    }
}