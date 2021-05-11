package com.courses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
