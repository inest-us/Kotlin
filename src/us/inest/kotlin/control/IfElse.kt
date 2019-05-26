package us.inest.kotlin.control

fun main(args: Array<String>) {
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    print("Maximum of: " + max) //print 5
}