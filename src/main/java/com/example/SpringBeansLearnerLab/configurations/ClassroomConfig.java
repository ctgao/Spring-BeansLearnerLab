package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.Classroom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {
    @Bean
    public Classroom currentCohort(){
        return null;
    }

    @Bean
    public Classroom previousCohort(){
        return null;
    }
}
