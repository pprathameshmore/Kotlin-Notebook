package Operators

fun main(args: Array<String>) {
    //There are two logical operators in Kotlin: || and &&

    val a = 10
    val b = 20
    val c = 30

    if ((a < b) && (c > b)) {
        print("Correct")
    } else {
        print("False")
    }

    if ((a < b) || (c > b)) {
        print("Correct")
    } else {
        print("False")
    }

}