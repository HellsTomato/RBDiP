package org.example;

public class StringUtils {
    public boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public int countWords(String input) {
        if (input == null || input.isBlank()) return 0;
        return input.trim().split("\\s+").length;
    }
}

