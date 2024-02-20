import java.util.Scanner

val reader = Scanner(System.`in`)
val start:Int = 10
val finish:Int = 200
var changeDistance:Float = 0f
var day:Int = 1
var sumDistance:Float = 10f
var distance:Float = 10f
var logic = Calculate()

fun main(args: Array<String>) {
    println("Введите изменение дистанции, в диапазоне больше 0% и меньше 50%")
    changeDistance = 1+reader.nextFloat()/100
    var result = logic.findResult(changeDistance)
    println("Количество дней = ${result[0]}")
    println("Суммарная дистанция = ${result[1]}")
}
class Calculate()
{
    fun findResult(changeDistance:Float): Array<String>{
    while (sumDistance<finish) {
        distance *= changeDistance
        sumDistance += distance
        day++
    }
    var result = arrayOf(day.toString(), sumDistance.toString())
    return result}
}




