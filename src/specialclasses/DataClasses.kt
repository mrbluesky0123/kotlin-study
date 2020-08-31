package specialclasses

data class User(val name: String, val id: Int)

fun main(args: Array<String>) {
    val user = User("Alex", 1425)
    println(user)

    val secondUser = User("Randy", 46312)
    val thirdUser = User("Alex", 1425)

    println("user == thirdUser : ${user == thirdUser}")
    println("user === thirdUser : ${user === thirdUser}")

    var user2 = user.copy()
    println(user2)
    user2 = user.copy("Zakk")
    println(user2)
    user2 = user.copy(id = 2)
    println(user2)

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}