package com.firstappjava17.first_spring_app_in_java_seventeen.exception;

public class GradeNotFoundException extends RuntimeException { 

    public GradeNotFoundException(Long studentId, Long courseId) {
        super("The grade with student id: '" + studentId + "' and course id: '" + courseId + "' does not exist in our records");
    }
    
}