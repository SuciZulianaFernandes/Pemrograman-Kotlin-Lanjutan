fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //Lambda Function
    val myLambda :(String)->Unit = {s:String->print(s)}
    val v:String = "Jurusan Teknik Informatika"
    myLambda(v)

    //inline function
    myFun(v,myLambda) //passing lambda as a parameter of another function
}

fun MyFunction(x: String): String {
    var c:String = "Hey! Welcome To ---"
    return (c+x)
}

fun myFun(a:String, action:(String)->Unit) {
    print("\nHeyy!!!")
    action(a)//call to lambda function
}