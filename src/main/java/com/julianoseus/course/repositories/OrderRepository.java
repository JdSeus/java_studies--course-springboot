package com.julianoseus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoseus.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
