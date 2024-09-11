fun main(args: Array<String>) {
    val listNumber = listOf(1,2,3,4,5,6)
    println("Jumlah nilai pada elemen listNumber = ${getsum(listNumber)}")
}

fun getsum(values: List<Int>) : Int{
    var total = 0;
    for (i in values) total += i
    return total //return value
}