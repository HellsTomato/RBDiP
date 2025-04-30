
package org.example.lab5.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users", indexes = @Index(columnList = "name"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
