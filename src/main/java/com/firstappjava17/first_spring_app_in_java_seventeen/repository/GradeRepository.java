package com.firstappjava17.first_spring_app_in_java_seventeen.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Grade;

import jakarta.transaction.Transactional;

public interface GradeRepository extends CrudRepository<Grade, Long> {
    Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long CourseId);

    @Transactional
    void deleteByStudentIdAndCourseId(Long studentId, Long CourseId);

    List<Grade> findByStudentId(Long studentId);

    List<Grade> findByCourseId(Long courseId);
}
