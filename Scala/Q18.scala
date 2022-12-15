object MyClass {
    def main(args: Array[String]) {
        var n:Int=0
        print("Enter number : ")
        n=scala.io.StdIn.readInt()
        var n2:Int=0
        while(n>0){
            n2=n2*10+n%10
            n/=10
        }
        while(n2>0) {
            n2%10 match {
                case 1 => print("one ")
                case 2 => print("two ")
                case 3 => print("three ")
                case 4 => print("four ")
                case 5 => print("five ")
                case 6 => print("six ")
                case 7 => print("seven ")
                case 8 => print("eight ")
                case 9 => print("nine ")
                case 0 => print("zero ")
            }
            n2/=10
        }
    }
}