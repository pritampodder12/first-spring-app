package com.firstappjava17.first_spring_app_in_java_seventeen.exception;

public class StudentNotEnrolledException extends RuntimeException { 

    public StudentNotEnrolledException(Long studentId, Long courseId) {
        super("The student with id: '" + studentId + "' is not enrolled in the course with id: '" + courseId);
    }
    
}