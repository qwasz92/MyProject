package com.hank

fun main() {
//    println("Hello Kontlin")
//    Human().hello()
    val h=Human()
    h.hello()
    val age = 19//(無法改變)\\
    var age2 = 18//(可改變)\\
    age2 = 20
    var weight = 66.5f
    val name = "Hank"
    //val name: String name="Hank"\\
}
class Human{
    fun hello(){
        println("Hello kotlin")
    }
}