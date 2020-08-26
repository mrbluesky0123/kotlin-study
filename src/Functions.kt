import java.util.Scanner
import kotlin.math.sqrt

/**
 * Functions
 */

fun printMessage(message: String): Unit {
    println(message);
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y


fun printAll(vararg messages: String): Unit {
    for(m in messages)
        println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String = "LOG"): Unit {
    for(m in messages)
        println("$prefix: $m")
}

fun log(vararg entries: String) {
    printAllWithPrefix(*entries)
}

/*fun main(args: Array<String>) {
//    printMessage("Hello, World!")
//    printMessageWithPrefix("Hello", "Log")
//    printMessageWithPrefix("Hello")
//    printMessageWithPrefix(prefix = "DEBUG", message = "Hello, world!")
//    println(sum(1, 2))
//    println(multiply(2, 4))

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "Ferarri" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    infix fun String.plus(next: String) = "$this, $next"
    val v1 = "Hello"
    val v2 = "World!"
    val v3 = "Everyone!"
    println(v1 plus v2 plus v3)

    printAll("A", "B", "C", "D", "E", "F")
    log("a", "b", "c", "d", "e", "f", "g", "h")
    val sophia = Person("Sophia")
    val claudia = Person("Cloudia")
    sophia likes claudia

}*/

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other)}
}