
fun main(args: Array<String>) {
    /* Variables */
    var a: String = "asdasd"
    println(a)
    val b: Int = 1
    val c = 3

    val d: Int
    if(b < c) {
        d = 1
    }
    else {
        d = 2
    }

    /* Null Safety */
    var neverNull: String = "string which cannot be null"
//    neverNull = null

    var nullable: String? = "string that can be null"
    nullable = null

//    var inferredNonNull = "The com"
//
//    inferredNonNull = null
//
//    fun strLength(notNull: String): Int {
//        return notNull.length
//    }
//
//    println(strLength(nullable))

    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "Hello, man~~"
        } else {
            return "Empty or null string"
        }
    }

    println(describeString(nullable))


}