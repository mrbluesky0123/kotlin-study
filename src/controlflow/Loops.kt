package controlflow//fun controlflow.main(args: Array<String>) {
//    val zoo: controlflow.Zoo = controlflow.Zoo(listOf(controlflow.Animal("zebra"), controlflow.Animal("lion")))
//
////    while(zoo.iterator().hasNext()) {
////        println(zoo.iterator().next().name)
////        println(zoo.iterator().hasNext())
////    }
//
//    for(animal in zoo) {
//        println("Watch out, it's a ${animal.name}!")
//    }
//}

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}
