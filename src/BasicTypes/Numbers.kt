package BasicTypes

/*

The representation of numbers in Kotlin is pretty similar to Java, however,
Kotlin does not allow internal conversion of different data types.
 Following table lists different variable lengths for different numbers.

Double	64
Float	32
Long	64
Int	32
Short	16
Byte	8
 */

fun main(args: Array<String>) {
    val b: Byte = 1
    val i: Int = 1000
    val s: Short = 100
    val l: Long = 10000
    val f: Float = 1000.0F
    val d: Double = 1.3

    println(b)
    println(i)
    println(s)
    println(l)
    println(f)
    println(d)

}
