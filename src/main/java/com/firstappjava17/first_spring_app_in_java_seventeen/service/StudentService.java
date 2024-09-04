package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Student;

public interface StudentService {
    Student getStudent(Long id);

    Student saveStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getStudents();
}
