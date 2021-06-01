package com.courses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
