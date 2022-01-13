package com.julianoseus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianoseus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
