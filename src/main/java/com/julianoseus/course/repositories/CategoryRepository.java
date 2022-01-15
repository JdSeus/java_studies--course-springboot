package com.julianoseus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoseus.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
