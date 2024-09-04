package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Course;
import com.firstappjava17.first_spring_app_in_java_seventeen.exception.CourseNotFoundException;
import com.firstappjava17.first_spring_app_in_java_seventeen.repository.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;

    @Override
    public Course getCourse(Long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        return unwrapCourse(course, courseId);
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> getCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    static Course unwrapCourse(Optional<Course> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new CourseNotFoundException(id);
    }

}
