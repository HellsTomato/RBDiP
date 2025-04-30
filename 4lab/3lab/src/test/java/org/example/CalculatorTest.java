package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdditionOutput() {
        Calculator calc = new Calculator();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calc.doMath(2, 3, "+");

        assertTrue(outContent.toString().contains("Результат: 5"));
    }

    @Test
    void testDivisionByZeroOutput() {
        Calculator calc = new Calculator();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        calc.doMath(10, 0, "/");

        assertTrue(outContent.toString().contains("Ошибка: деление на ноль"));
    }
}
