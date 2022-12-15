import scala.io.StdIn._
object MyClass { 
    def main(args: Array[String]) { 
        println("Enter Positive No.: ");
        var x=readInt();
        if(x%3==0 ||x%7==0){
            println("Given No. is multiple of 3 or 7");
        }else {
            println("Given No. is not multiple of 3 or 7");
        }
        
    } 
}