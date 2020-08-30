package intro

open class Dog {
    open fun sayHello() {
        println("Wow wow!")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
        println("Wif wif!")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhh!!")
    }
}

class SiberianTiger: Tiger("Korean")

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: offfff!!")
    }
}

class Asiatic(name: String): Lion(name = name, origin = "India")

//fun controlflow.main(args: Array<String>) {
//    val dog: intro.Dog = intro.Yorkshire()
//    dog.sayHello()
//
//    val tiger: intro.Tiger = intro.SiberianTiger()
//    tiger.sayHello()
//
//    val lion: intro.Lion = intro.Asiatic("Rufo")
//    lion.sayHello()
//
//}