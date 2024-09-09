package com.firstappjava17.first_spring_app_in_java_seventeen.repository;

import org.springframework.data.repository.CrudRepository;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}