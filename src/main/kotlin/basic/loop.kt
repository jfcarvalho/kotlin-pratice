package basic

val items = listOf("apple", "banana", "kiwifruit")

fun describe(obj: Any): String =
    when(obj) {
        1   -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun ranges() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun loops(): Unit {
    println("Normal Order");
    println();

    for(item in items) {
        println(item);
    }

    println();
    println("Normal Order with indices");
    println();

    for(index in items.indices) {
        println("Item at $index is  ${items[index]}");
    }

    println();
    println("Reversed Order with Indices");
    println();

    var index = 0;

    while(index < items.size) {
        println("Item at $index is ${items.reversed()[index]}");
        index++;
    }

    println();
    println("When expressions");
    println();

    println(describe(1))
    println(describe(2.7))
    println(describe(Long.MAX_VALUE))
    println(describe("zasasa"))

    println();
    println("Ranges Expressions");
    println();

    ranges();


}

fun main () {
    loops();
}