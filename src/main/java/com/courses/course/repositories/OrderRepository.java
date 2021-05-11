package com.courses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
