package org.example.service;

import org.example.model.Order;

public class NotificationService {
    public void notifyCustomer(Order order, double total) {
        System.out.println("Уведомление отправлено клиенту: " +
                order.getCustomerName() + ", сумма: " + total);
    }
}
