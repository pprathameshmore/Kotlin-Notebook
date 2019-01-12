package BasicTypes

fun main(args: Array<String>) {

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    //Print single element in array
    println("This is first number in array : " + numbers[0])

    //Print all elements using array
    for (number in numbers) {

        if (number == 2) {
            println("Found Number " + number + " at " + numbers[number])
        }

        //println(number)
    }
    val myName: String = "Prathamesh"
    for (char in myName) {
        print(char)
    }

    //That's cool feature of Kotlin
    for (i in 1..10) print(i)
    println()
    for (i in 5 downTo 1) println(i)
    for (i in 5 downTo 1 step 2) println(i)

    val friends: Array<String> = arrayOf("Nawaz", "Shubham", "Nitin")
    //Simply you can do this
    //var friends = arrayOf("Nitin", "Nawaz")

    for (friend in friends) {
        println(friend)
    }
    println("Indices")
    for (friend in friends.indices) {
        if (friend % 2 == 0) {
            print(friends[friend] + " ")
        }
    }


}