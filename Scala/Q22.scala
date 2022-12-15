import scala.io.StdIn._
class Racers {
    var s1 = 0.0
    var s2 = 0.0
    var s3 = 0.0
    var s4 = 0.0
    var s5 = 0.0 
    def get_speeds() {
        this.s1 = readFloat() 
        this.s2 = readFloat()
        this.s3 = readFloat()
        this.s4 = readFloat()
        this.s5 = readFloat()
    }
    def show_winner() {
        var avg = (this.s1 + this.s2 + this.s3 + this.s4 + this.s5) / 5.0
        if (this.s1 > avg) 
            println("Racer 1 with speed " + this.s1 + " will qualify")
        if (this.s2 > avg) 
            println("Racer 2 with speed " + this.s2 + " will qualify")
        if (this.s3 > avg) 
            println("Racer 3 with speed " + this.s3 + " will qualify")
        if (this.s4 > avg) 
            println("Racer 4 with speed " + this.s4 + " will qualify")
        if (this.s5 > avg)
            println("Racer 5 with speed " + this.s5 + " will qualify")
    }
}
object Main {
    def main(args: Array[String]) {
        var obj = new Racers() 
        obj.get_speeds() 
        obj.show_winner()
    }
}