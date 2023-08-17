package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {
    @Bean
    public Instructors tcUsaInstructors(){
        return null;
    }

    @Bean
    public Instructors toUkInstructors(){
        return null;
    }

    @Primary
    @Bean("instructors")
    public Instructors getInstructors(){
        return null;
    }
}
