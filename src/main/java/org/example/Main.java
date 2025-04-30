package org.example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "Иван Иванов", 1500.0, 3, true);
        OrderService service = new OrderService();
        service.handle(order);
    }
}
