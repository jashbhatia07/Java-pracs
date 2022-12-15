import scala.util.control.Breaks._

object MyClass {
    def main(args: Array[String]) {
        var n:Int=0
        print("Enter number : ")
        n=scala.io.StdIn.readInt()
        if(n==1)
        print("Neither prime nor composite")
        else if(n==2)
        print("Prime")
        else {
            var i:Int=2
            var flag:Int=0
            breakable {
                do {
                    if(n%i==0){
                        flag=1
                        break
                    }
                    i=i+1
                } while(i<=math.sqrt(n))
            }
            if(flag==1)
            print("Composite")
            else
            print("Prime")
        }
    }
}