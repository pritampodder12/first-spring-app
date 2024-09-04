package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Course;
import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Grade;
import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Student;
import com.firstappjava17.first_spring_app_in_java_seventeen.exception.GradeNotFoundException;
import com.firstappjava17.first_spring_app_in_java_seventeen.repository.CourseRepository;
import com.firstappjava17.first_spring_app_in_java_seventeen.repository.GradeRepository;
import com.firstappjava17.first_spring_app_in_java_seventeen.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService {

    GradeRepository gradeRepository;
    StudentRepository studentRepository;
    CourseRepository courseRepository;

    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        return unwrapGrade(grade, studentId, courseId);
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = StudentServiceImpl.unwrapStudent(studentRepository.findById(studentId), studentId);
        Course course = CourseServiceImpl.unwrapCourse(courseRepository.findById(courseId), courseId);
        grade.setStudent(student);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        Grade unwrappedGrade = unwrapGrade(grade, studentId, courseId);
        unwrappedGrade.setScore(score);
        return gradeRepository.save(unwrappedGrade);
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {
        gradeRepository.deleteByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return gradeRepository.findByCourseId(courseId);
    }

    @Override
    public List<Grade> getGrades() {
        return (List<Grade>) gradeRepository.findAll();
    }

    static Grade unwrapGrade(Optional<Grade> entity, Long studentId, Long courseId) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new GradeNotFoundException(studentId, courseId);
    }
}
