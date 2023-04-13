package functions

fun main(){
    sayHello("Hello")
    println(getMax(5,10))
    println(getMax(2,4.5))
    println(sumNumbers(1,2,3,4))
}

fun sayHello(value: String){
    println(value)
}

fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun getMax(a: Int, b: Double) = if (a > b)a else b

fun sumNumbers(vararg numbers: Int): Int{
    var result: Int = 0
    numbers.forEach { num-> result+=num }
    return result
}