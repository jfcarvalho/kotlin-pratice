fun sum(a:Int, b:Int): Int {
    return a+b
}

fun sumInferred(a:Int, b:Int) = a+b

fun sumWithVoid(a:Int, b:Int): Unit {
    println("sum of $a and $b is $(a+b)")
}

fun main(args: Array<String>) {
    print(sum(1,2));
    print(sumInferred(1,2));
    sumWithVoid(5,8)
}