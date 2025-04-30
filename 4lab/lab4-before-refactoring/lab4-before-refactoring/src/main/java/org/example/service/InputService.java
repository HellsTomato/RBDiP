package org.example.service;

import org.example.model.Order;

import java.util.Scanner;

public class InputService {
    private final Scanner scanner = new Scanner(System.in);

    public Order getOrderFromUser() {
        System.out.print("Введите ID заказа: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // очистка после nextInt()

        System.out.print("Введите имя клиента: ");
        String name = scanner.nextLine();

        System.out.print("Введите цену за единицу товара: ");
        double price = scanner.nextDouble();

        System.out.print("Введите количество: ");
        int qty = scanner.nextInt();

        System.out.print("Клиент лоялен? (true/false): ");
        boolean loyal = scanner.nextBoolean();

        return new Order(id, name, price, qty, loyal);
    }
}
