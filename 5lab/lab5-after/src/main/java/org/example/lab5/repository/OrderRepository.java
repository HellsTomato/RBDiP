
package org.example.lab5.repository;

import org.example.lab5.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("""
        SELECT o FROM Order o 
        JOIN o.user u 
        WHERE u.name = :name
    """)
    List<Order> findOrdersByUserName(@Param("name") String name);
}
