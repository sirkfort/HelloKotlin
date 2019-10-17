//fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")
fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Book")
    sayHello(greeting = "Hi", itemsToGreet = *interestingThings)
    greetPerson()

//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//    map.forEach { key, value -> println("$key -> $value") }
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))
//    println()
//    interestingThings.forEach {  interestingThing ->
//        println(interestingThing)
//    }

//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }
}