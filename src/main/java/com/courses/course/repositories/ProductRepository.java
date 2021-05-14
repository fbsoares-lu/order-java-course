package com.courses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
