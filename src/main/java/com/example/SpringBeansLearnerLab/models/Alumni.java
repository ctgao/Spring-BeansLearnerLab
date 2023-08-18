package com.example.SpringBeansLearnerLab.models;

import com.example.SpringBeansLearnerLab.configurations.ClassroomConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
    Students students;
    Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("previousCohort")Classroom classroom){
        students = classroom.getStudents();
        instructors = classroom.getInstructors();
    }

    @PostConstruct
    public void executeBootcamp(){
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        instructors.forEach(i -> i.lecture(students, numberOfHoursPerInstructor));
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
