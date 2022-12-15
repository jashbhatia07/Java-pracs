import scala.io.StdIn._
object MyClass { 
    def main(args: Array[String]) { 
        println("Enter First No.: ");
        var x=readInt();
        println("EnterSecond No.: ");
        var y=readInt();
        //Anonymous Fn
        var myfun=(x:Int,y:Int)=>{
            if(x==y){
                3*(x+y)
            }else{
                x+y
            }
        }
        println(myfun(x,y));
    } 
}