package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Calculator;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    void testDivisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
