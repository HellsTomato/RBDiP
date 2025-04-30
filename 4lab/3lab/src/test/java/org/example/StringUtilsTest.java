package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testPalindromeDetection() {
        StringUtils utils = new StringUtils();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        utils.doStuff("А роза упала на лапу Азора");

        assertTrue(outContent.toString().contains("Это палиндром"));
    }

    @Test
    void testWordCountOutput() {
        StringUtils utils = new StringUtils();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        utils.doStuff("один два три");

        assertTrue(outContent.toString().contains("Количество слов: 3"));
    }
}
