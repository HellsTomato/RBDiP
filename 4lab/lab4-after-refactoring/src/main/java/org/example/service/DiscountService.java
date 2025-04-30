package org.example.service;

import org.example.model.Order;

public class DiscountService {
    public double calculateDiscount(Order order) {
        if (!order.isLoyal()) return 0.0;

        double price = order.getPrice();
        if (price > 1000) return 0.1;
        else if (price > 500) return 0.05;
        else return 0.02;
    }
}
