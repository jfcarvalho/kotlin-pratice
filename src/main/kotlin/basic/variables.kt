package basic

val PI = 3.14;
var x = 0;
var a =1
val s1 = "a is $a"
val s2 = "${s1.replace("is", "was")}, but now is $a";

fun incrementX() {
    x += 1;
}

fun main() {
    println(s1);
    println(s2);
    println(x);
    incrementX();
    incrementX();
    incrementX();
    println(x);
}