import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CalculateTest {
    private val testResult:Calculate = Calculate()

    @Test
    fun testResult1() {
        val expectedResult = arrayOf("12", "213.84285")
        val changeDistance = 1.1f
        var result = testResult.findResult(changeDistance)
        assertEquals(expectedResult[0], result[0])
        assertEquals(expectedResult[1], result[1])
    }
}