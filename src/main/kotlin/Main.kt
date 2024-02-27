import java.util.*

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
    try{
        changeDistance = 1+reader.nextFloat()/100
    }catch (e: InputMismatchException)
    {
        println("Некорректный ввод")
        return
    }

    var result = logic.findResult(changeDistance)
    println(result[0])
    println(result[1])
}
class Calculate()
{
    fun findResult(changeDistance:Float): Array<String>{
        if(changeDistance>1.5 || changeDistance<1) return arrayOf("", "Неверно задано изменение дистанции")
        while (sumDistance<finish) {
            distance *= changeDistance
            sumDistance += distance
            day++
        }
        var result = arrayOf("Количество дней = ${day}", "Суммарная дистанция = ${sumDistance}")
        return result}
}




