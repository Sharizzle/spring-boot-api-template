package com.test.api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository)
    {
        return args -> {
            Student sharif = new Student(
                    "Sharif",
                    "sharif.kanaan@gmail.com",
                    LocalDate.of(2000, JANUARY, 23)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 17)
            );

            studentRepository.saveAll(
                    Arrays.asList( sharif, alex)
            );
        };
    }
}
