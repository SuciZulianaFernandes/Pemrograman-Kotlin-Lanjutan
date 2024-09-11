fun main(args: Array<String>) {
    //panggil anpa argumen
    connectToDb()
    println()
    //panggil dengan 2 argumen
    connectToDb("sqlserver", "Suci")
}

fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password: String = "secret"){
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}