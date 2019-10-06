package train

import java.util.*

fun main(){
    var scanner = Scanner(System.`in`)
    var name = null
    print("Please enter number of tickets:")
    var tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt()
    var test = TesterKotlin("",tickets,roundTrip)
    test.print()
}
class TesterKotlin(var name:String,var tickets:Int,var roundTrip:Int){
    fun print(){
        println("Total tickets:"+tickets+"\t"+"Round-trip:"+roundTrip+"\t"+"Total:"+toatle())
    }
    fun toatle():Int{
        return (tickets*1000)+(roundTrip*800)
    }
}
