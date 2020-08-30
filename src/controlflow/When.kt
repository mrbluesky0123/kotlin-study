package controlflow

fun main(args: Array<String>) {

    var myClass: MyClass = MyClass()
    cases(myClass)

    var obj: Any = "Hello"
    val result = when(obj) {
        1 -> "One"
        "Hello" -> 2
        is String -> 1.2
        else -> 9.8
    }

    println(result)

}

fun cases(obj: Any) {
    when(obj) {
        1 -> println("one")
        "Hello" -> println("Greeting!")
        is Long -> println("Obj is long")
        is String -> println("Not a string")
        is MyClass -> println("controlflow.MyClass instance")
        else -> println("Fuck that shit")
    }
}

class MyClass