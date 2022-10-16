import kotlin.math.pow
import kotlin.math.sqrt
fun main(args: Array<String>) {
    val point1= Point(5.0, 6.0)
    val point2= Point(7.0, 5.0)
    val point3= Point(12.0, 4.0)

// toStringის მეთოდი
    println(point1.toString())
    println(point2.toString())
    println(point3.toString())
// Equalsის მეთოდი
    println("_____")
    println(point1.equals(point2))
    println(point2.equals(point3))
// simetriulad gadasvla
   println("_____")
    println(point1.moveSymetrically())
    println(point2.moveSymetrically())
    println(point3.moveSymetrically())
// calculate distance
    println("_____")
    println("Distance: " + point1.calculateDistance(point2))
    println("Distance: " + point1.calculateDistance(point3))
    println("Distance: " + point2.calculateDistance(point3))
}


class Point(x: Double, y: Double) {
    private var xCoordinate: Double = x
    private var yCoordinate: Double = y

    // toStringის მეთოდი
    override fun toString(): String {
        return "Coordinates: X($xCoordinate) Y($yCoordinate) "
    }

    // equalsis მეთოდი
    override fun equals(other: Any?): Boolean {
        return other is Point && other.xCoordinate == xCoordinate && other.yCoordinate == yCoordinate
    }

    // ფუნქცია სიმეტრიულად გადასვლისთვის
    fun moveSymetrically(): Point {
        xCoordinate *= -1
        yCoordinate *= -1
        return Point(xCoordinate, yCoordinate)
    }

    fun calculateDistance(point: Point): Double {
        return sqrt((point.xCoordinate-xCoordinate).pow(2)+(point.yCoordinate-yCoordinate).pow(2))

    }

}

