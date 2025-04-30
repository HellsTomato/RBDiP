package org.example;

public class Calculator {
    public void doMath(int a, int b, String op) {
        if (op.equals("+")) {
            System.out.println("Результат: " + (a + b));
        } else if (op.equals("-")) {
            System.out.println("Результат: " + (a - b));
        } else if (op.equals("*")) {
            System.out.println("Результат: " + (a * b));
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Ошибка: деление на ноль");
            } else {
                System.out.println("Результат: " + (a / b));
            }
        } else {
            System.out.println("Неверная операция");
        }
    }
}
