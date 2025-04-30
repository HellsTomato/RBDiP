
package org.example.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
