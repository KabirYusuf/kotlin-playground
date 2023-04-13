package operators

fun main(){
    var x: Int = 5
    val y: Int = 6
    var z: Int = x + y

    println(z)
    println(++x)

    var isActive = true
    if (isActive) println(true)

    val alarm = 54
    when (alarm){
        !in 1..30-> println("yes")
    }
    for (i in 1..3){
        println(i)
    }

}