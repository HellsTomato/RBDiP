package org.example;

public class NotificationService {
    public void sendNotification(String customerName, double total) {
        System.out.println("Уведомление отправлено клиенту: " + customerName + " с суммой заказа: " + total);
    }
}

