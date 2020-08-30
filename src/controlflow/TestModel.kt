package controlflow

class TestModel(private var attrbt1: String) {

    private var attrbt2: String = ""

    init{
        attrbt1 = "Hello, World!"
        println("In init : $attrbt1")
    }

    constructor(attrbt1: String, attrbt2: String) : this(attrbt1) {
        this.attrbt2 = attrbt2
        println("In constructor: ${this.attrbt2}")
    }

}