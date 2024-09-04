package com.firstappjava17.first_spring_app_in_java_seventeen.repository;

import org.springframework.data.repository.CrudRepository;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
    // Course findByCourseId(Long courseId);
}
