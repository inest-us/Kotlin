package us.inest.kotlin.types

fun main(args: Array<String>) {
    val i: Int = 2
    for (j in 1..4)
        print(j) // prints "1234"
    println()
    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println("we found your number -- " + i)
    }
}