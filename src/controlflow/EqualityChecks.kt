package controlflow

class Clazz(val name: String) {
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Clazz){
            return false
        }
        return name == other.name
    }
}

fun main(args: Array<String>) {
    var clazz1 = Clazz("123")
    var clazz2 = Clazz("123")

    if(clazz1 == clazz2) {
        println("True")
    } else {
        println("False")
    }

//    clazz2 = clazz1

    if(clazz1 === clazz2) {
        println("True")
    } else {
        println("False")
    }

}

