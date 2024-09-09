package com.firstappjava17.first_spring_app_in_java_seventeen.service;


import com.firstappjava17.first_spring_app_in_java_seventeen.entity.User;

public interface UserService {
    User getUser(Long id);
    User saveUser(User user);
}