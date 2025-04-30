package org.example;
import org.example.model.Order;
import org.example.service.*;

public class Main {
    public static void main(String[] args) {
        InputService inputService = new InputService();
        DiscountService discountService = new DiscountService();
        LoggerService loggerService = new LoggerService();
        NotificationService notificationService = new NotificationService();

        Order order = inputService.getOrderFromUser();

        OrderService orderService = new OrderService(discountService, loggerService, notificationService);
        orderService.processOrder(order);
    }
}