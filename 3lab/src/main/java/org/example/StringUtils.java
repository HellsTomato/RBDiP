package org.example;

public class StringUtils {
    public void doStuff(String input) {
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

        String[] words = input.trim().split(" ");
        System.out.println("Количество слов: " + words.length);
    }
}
