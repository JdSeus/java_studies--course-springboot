package com.julianoseus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoseus.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
