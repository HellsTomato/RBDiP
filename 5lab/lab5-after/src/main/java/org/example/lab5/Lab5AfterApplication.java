
package org.example.lab5;

import org.example.lab5.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab5AfterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab5AfterApplication.class, args);
    }

    @Bean
    public CommandLineRunner test(OrderService service) {
        return args -> {
            System.out.println("Заказы John Doe:");
            service.getOrdersByUserName("John Doe").forEach(System.out::println);
        };
    }
}
