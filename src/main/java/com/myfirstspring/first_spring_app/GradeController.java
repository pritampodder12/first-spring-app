package com.myfirstspring.first_spring_app;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    List<Grade> studentGrades = Arrays.asList(
        new Grade("Pritam", "Math", "A+"),
        new Grade("Anirban", "Geography", "Z-"),
        new Grade("Indu", "Stat", "AA+"),
        new Grade("Indu", "Stat", "AA+")
    );

    @GetMapping("/grades")
    public String getGrades(Model model) {
        // studentGrades.add(new Grade("Pritam", "Math", "A+"));
        // studentGrades.add(new Grade("Anirban", "Geography", "Z-"));
        // studentGrades.add(new Grade("Mohan", "Computer", "Z--"));
        // studentGrades.add(new Grade("Indu", "Stat", "AA+"));
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
