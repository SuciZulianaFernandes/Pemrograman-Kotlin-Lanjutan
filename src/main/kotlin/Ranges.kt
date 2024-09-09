fun main(args: Array<String>) {
    //ranges
    val i:Int = 2
    for (j in 1..4)
        print(j) // prints "1234"
    println()

    if (i in 1..0 ) {
        println("we found your number --"+i)
    }
}
