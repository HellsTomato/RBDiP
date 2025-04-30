package org.example;

public class ConsoleApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.doMath(10, 5, "+");

        StringUtils utils = new StringUtils();
        utils.doStuff("А роза упала на лапу Азора");
    }
}
