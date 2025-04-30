package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.StringUtils;

class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("А роза упала на лапу Азора"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("Привет, мир"));
    }

    @Test
    void testWordCountNormal() {
        assertEquals(3, utils.countWords("один два три"));
    }

    @Test
    void testWordCountEmptyString() {
        assertEquals(0, utils.countWords(""));
    }

    @Test
    void testWordCountNullString() {
        assertEquals(0, utils.countWords(null));
    }
}
