package com.firstappjava17.first_spring_app_in_java_seventeen.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByUsername(String username);
}