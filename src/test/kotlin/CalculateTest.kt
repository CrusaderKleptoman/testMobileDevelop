import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CalculateTest {
    private val testResult:Calculate = Calculate()

    @Test
    fun testResultNormal() {
        val expectedResult = arrayOf("Количество дней = 12", "Суммарная дистанция = 213.84285")
        val changeDistance = 1.1f
        var result = testResult.findResult(changeDistance)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }
    @Test
    fun testResultBelowZero() {
        val expectedResult = arrayOf("", "Неверно задано изменение дистанции")
        val changeDistance = 0.99f
        var result = testResult.findResult(changeDistance)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }
    @Test
    fun testResultAboveFifty() {
        val expectedResult = arrayOf("", "Неверно задано изменение дистанции")
        val changeDistance = 1.6f
        var result = testResult.findResult(changeDistance)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }
}