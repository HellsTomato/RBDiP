package org.example;

public class OrderService {

    private NotificationService notification = new NotificationService();

    public void handle(Order order) {
        double discount = 0.0;
        if (order.isLoyal) {
            if (order.price > 1000) {
                discount = 0.1;
            } else if (order.price > 500) {
                discount = 0.05;
            } else {
                discount = 0.02;
            }
        }

        double total = order.price * order.quantity * (1 - discount);

        if (total > 5000) {
            System.out.println("Большой заказ! Покупатель: " + order.customerName);
        }

        System.out.println("Обработка заказа #" + order.id);
        System.out.println("Имя клиента: " + order.customerName);
        System.out.println("Сумма: " + total);
        System.out.println("Скидка: " + (discount * 100) + "%");

        if (!order.customerName.isEmpty()) {
            String firstLetter = order.customerName.substring(0, 1).toUpperCase();
            System.out.println("Письмо будет отправлено на имя, начинающееся с: " + firstLetter);
        }

        log(order.id, order.customerName, total);
        notification.sendNotification(order.customerName, total);
    }

    private void log(int id, String name, double total) {
        System.out.println("[LOG] Заказ #" + id + ": " + name + ", итого: " + total);
    }
}

