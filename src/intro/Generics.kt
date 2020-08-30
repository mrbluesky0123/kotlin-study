package intro

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size(): Int = elements.size

    override fun toString() = "intro.MutableStack(${elements.joinToString()})"

}

//fun controlflow.main(args: Array<String>) {
//
//    val mutableStack = intro.MutableStack<String>("aaa", "bbb")
//    println(mutableStack.toString())
//
//}