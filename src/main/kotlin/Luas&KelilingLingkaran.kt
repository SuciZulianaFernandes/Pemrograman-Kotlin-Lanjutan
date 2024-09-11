import kotlin.math.PI

fun main(args: Array<String>) {
    //advance exercise
    print("enter the circle's radus (cm): ")
    val radius = readln().toDouble()
    var circumference = 2 * PI * radius
            var area = PI * radius * radius
    println("The circle's circumference based on the given radius is: " + circumference + " cm")
    println("Area of the circle is: " + area + " cm^2")
}