package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Course;

public interface CourseService {
    Course getCourse(Long courseId);

    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> getCourses();
}
