package org.example;

public class ConsoleApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));

        StringUtils utils = new StringUtils();
        String input = "А роза упала на лапу Азора";

        if (utils.isPalindrome(input)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }

        System.out.println("Количество слов: " + utils.countWords(input));
    }
}

