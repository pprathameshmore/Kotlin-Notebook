package Operators

fun main(args: Array<String>) {
    val a = 10
    val b = 20

    val max = if (a > b) {
        print("A is greater than B")
        a
    } else {
        print("B is greater than A")
        b
    }

    println("max = $max")

}