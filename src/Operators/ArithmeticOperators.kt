package Operators

fun main(args: Array<String>) {

    /* var = variable, so it can change
     val = value, so it can not change. */

    val number1: Double = 10.0
    val number2: Double = 10.0
    var resultStore: Double

    resultStore = number1 + number2
    println("Addition : " + resultStore)


    resultStore = number1 - number2
    println("Substraction : " + resultStore)


    resultStore = number1 * number2
    println("Multiplicatioj : " + resultStore)


    resultStore = number1 / number2
    println("Division : " + resultStore)


    resultStore = number1 % number2
    println("Mod : " + resultStore)

    var a = 5

    a *= 5

    print(a)


}