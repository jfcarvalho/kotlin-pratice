package basic

fun maxOf(a:Int, b:Int): Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}

/*
  * Nullable Values
*/

fun parseInt(str: String?): Int {
    if(str != null) {
        return Integer.parseInt(str)
    }
    return 0;
}

fun getStringLength(obj: Any): Int? {
    if(obj is String && obj.length > 0) {
        return obj.length;
    }
    return null;
}

fun maxOfOneLine(a:Int, b:Int) = if (a > b) a else b;

fun main() {
    println(maxOf(123, 5));
    println(maxOfOneLine(5,3232));
    println(parseInt("2345"));
    println(parseInt(null));
    println(getStringLength("Teste de String"));
    println(getStringLength(223));
}