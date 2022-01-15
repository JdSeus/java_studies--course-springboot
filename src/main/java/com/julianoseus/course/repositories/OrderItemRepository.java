package com.julianoseus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoseus.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
