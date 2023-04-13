package arrays

fun main(args: Array<String>){
//    val names = arrayOf("Kabir","Yusuf","Ade")
//    val numbers = arrayOfNulls<Int>(3)
//    numbers[0] = 3
//    println(numbers.size)
//    println(numbers[0])
//    for (name in names) println(name)
//    println(names[1])
val numbers = arrayOf(1,2,7,12,34,90,32)
    println(getMax(numbers))

}
fun getMax(arrayOfNums: Array<Int>): Int {
    var maxNum = arrayOfNums[0]
    for (i in arrayOfNums.indices) {
        if (arrayOfNums[i] > maxNum) maxNum = arrayOfNums[i]
    }
    return maxNum
}