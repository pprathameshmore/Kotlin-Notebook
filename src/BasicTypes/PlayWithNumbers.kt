package BasicTypes

fun main(args : Array<String>) {

    val a : Int = 10

    println(a === a)

    val boxedA : Int? = a
    val anotherBoxedB : Int? = a
    println(boxedA === anotherBoxedB)
    println(boxedA == anotherBoxedB)


}
