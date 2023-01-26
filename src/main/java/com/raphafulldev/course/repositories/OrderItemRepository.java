package com.raphafulldev.course.repositories;

import com.raphafulldev.course.entities.OrderItem;
import com.raphafulldev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
