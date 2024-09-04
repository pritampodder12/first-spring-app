package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Grade;

public interface GradeService {
    Grade getGrade(Long studentId, Long courseId);

    Grade saveGrade(Grade grade, Long studentId, Long CourseId);

    Grade updateGrade(String score, Long studentId, Long courseId);

    void deleteGrade(Long studentId, Long courseId);

    List<Grade> getStudentGrades(Long studentId);

    List<Grade> getCourseGrades(Long courseId);

    List<Grade> getGrades();
}
