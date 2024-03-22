import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class MainKtTest {

    @Test
    fun testSportPackage() {
        val car = BasicCar()
        val sportCar = SportPackage(car)

        val originalOut = System.out
        val outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))

        sportCar.assemble()

        assertEquals("Basic Car. Adding features of Sports Car.", outContent.toString().trim())

        System.setOut(originalOut)
    }

    @Test
    fun testLuxuryPackage() {
        val car = BasicCar()
        val luxuryCar = LuxuryPackage(car)

        val originalOut = System.out
        val outContent = ByteArrayOutputStream()
        System.setOut(PrintStream(outContent))

        luxuryCar.assemble()

        assertEquals("Basic Car. Adding features of Luxury Car.", outContent.toString().trim())

        System.setOut(originalOut)
    }
}