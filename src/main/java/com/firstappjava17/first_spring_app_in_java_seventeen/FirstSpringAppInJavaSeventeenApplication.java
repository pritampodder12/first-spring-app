package com.firstappjava17.first_spring_app_in_java_seventeen;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Course;
// import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Student;
import com.firstappjava17.first_spring_app_in_java_seventeen.repository.CourseRepository;
import com.firstappjava17.first_spring_app_in_java_seventeen.repository.StudentRepository;

@SpringBootApplication
public class FirstSpringAppInJavaSeventeenApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppInJavaSeventeenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
