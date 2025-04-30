package org.example.service;

import org.example.model.Order;

public class LoggerService {
    public void logOrder(Order order, double total) {
        System.out.println("[LOG] Заказ #" + order.getId() +
                ": " + order.getCustomerName() + ", итого: " + total);
    }
}
