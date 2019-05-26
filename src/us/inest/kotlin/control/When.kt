package us.inest.kotlin.control

fun main(args: Array<String>) {
    val x:Int = 5
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3,4 -> print(" Value of X either 3 or 4")
        else -> { // Note the block
            print("x is greater than 4")
        }
    }
}