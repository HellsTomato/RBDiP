package org.example.service;

import org.example.model.Order;

public class OrderService {
    private final DiscountService discountService;
    private final LoggerService loggerService;
    private final NotificationService notificationService;

    public OrderService(DiscountService discountService, LoggerService loggerService,
                        NotificationService notificationService) {
        this.discountService = discountService;
        this.loggerService = loggerService;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        double discount = discountService.calculateDiscount(order);
        double total = order.getPrice() * order.getQuantity() * (1 - discount);

        if (total > 5000) {
            System.out.println("Большой заказ! Покупатель: " + order.getCustomerName());
        }

        System.out.println("Обработка заказа #" + order.getId());
        System.out.println("Имя клиента: " + order.getCustomerName());
        System.out.println("Сумма: " + total);
        System.out.println("Скидка: " + (discount * 100) + "%");

        if (!order.getCustomerName().isEmpty()) {
            String firstLetter = order.getCustomerName().substring(0, 1).toUpperCase();
            System.out.println("Письмо будет отправлено на имя, начинающееся с: " + firstLetter);
        }

        loggerService.logOrder(order, total);
        notificationService.notifyCustomer(order, total);
    }
}
