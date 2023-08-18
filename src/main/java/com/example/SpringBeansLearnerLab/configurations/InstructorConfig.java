package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.Instructor;
import com.example.SpringBeansLearnerLab.models.Instructors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        return new Instructors(new Instructor(5L, "Minsoo"));
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        return new Instructors(new Instructor(6L, "Dima"));
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors getInstructors(){
        return new Instructors(new Instructor(1L, "Kris"));
    }
}
