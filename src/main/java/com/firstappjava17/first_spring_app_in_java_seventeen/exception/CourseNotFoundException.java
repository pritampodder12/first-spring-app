package com.firstappjava17.first_spring_app_in_java_seventeen.exception;

public class CourseNotFoundException extends RuntimeException { 

    public CourseNotFoundException(Long id) {
        super("The course id '" + id + "' does not exist in our records");
    }
    
}