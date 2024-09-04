package com.firstappjava17.first_spring_app_in_java_seventeen.web;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = Arrays.asList(
                new Student("Pritam"));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

}
