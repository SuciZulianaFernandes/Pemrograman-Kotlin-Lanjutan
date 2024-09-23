fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //lambda function
    val myLambda :(String) ->Unit = {s:String-> print(s) }
    val v:String = "Jurusan Teknin Informatika"
    myLambda(v)

    //inline Function
    myFunn(v, myLambda)
}

fun Myfunction(x: String): String{
    var c:String = "Hey!! Welcome To ---"
    return (c+x)
}
fun myFunn(a:String, action: (String)->Unit) {
    print("\nHeyyy!!")
    action(a)
}