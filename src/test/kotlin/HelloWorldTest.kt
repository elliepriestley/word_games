import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HelloWorldTest {

    @Test
    fun `When hello world function is called, returns Hello World!`() {
        // Arrange
        val underTest = HelloWorld()
        val expected: String = "Hello World!"

        // Act
        val actual: String = underTest.sayHello()

        // Assert
        assertEquals(expected, actual)
    }

}