package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents(){
        return null;
    }

    @Bean
    public Students previousStudents(){
        return null;
    }
}
