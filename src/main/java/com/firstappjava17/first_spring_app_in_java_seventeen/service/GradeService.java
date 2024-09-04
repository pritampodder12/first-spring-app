package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Grade;

public interface GradeService {
    Grade getGrade(Long studentId, Long courseId);

    Grade saveGrade(Grade grade, Long studentId, Long CourseId);

    void deleteGrade(Long id);

    List<Grade> getGrades();
}
