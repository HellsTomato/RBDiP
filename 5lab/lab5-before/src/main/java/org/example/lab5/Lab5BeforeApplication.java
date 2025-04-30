package org.example.lab5;

import org.example.lab5.repository.UserRepository;
import org.example.lab5.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab5BeforeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab5BeforeApplication.class, args);
    }

    @Bean
    CommandLineRunner testRun(UserRepository userRepo, OrderService orderService) {
        return args -> {
            System.out.println("Пользователи:");
            userRepo.findAll().forEach(System.out::println);

            System.out.println("Заказы John Doe:");
            orderService.getOrdersByUserName("John Doe").forEach(System.out::println);
        };
    }
}

