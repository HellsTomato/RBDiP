package org.example.lab5.service;

import org.example.lab5.model.Order;
import org.example.lab5.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByUserName(String userName) {
        // ПЛОХОЙ ЗАПРОС
        return orderRepository.findAll()
                .stream()
                .filter(order -> order.getUser().getName().equals(userName))
                .toList();
    }
}

