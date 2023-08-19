package com.example.SpringBeansLearnerLab.models;

import com.example.SpringBeansLearnerLab.configurations.StudentConfig;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AlumniTest {
    @Autowired
    Alumni alumni;

    @Test
    void executeBootcamp() {
        Students alumnus = alumni.getStudents();
        Instructors instructors = alumni.getInstructors();

        int numberOfInstructors = instructors.size();
        int numberOfStudents = alumnus.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        alumnus.forEach(a -> Assert.assertEquals(numberOfHoursToTeachEachStudent, a.getTotalStudyTime(), 0.001));
        instructors.forEach(i -> Assert.assertEquals(numberOfHoursPerInstructor, i.getNumberOfHoursTaught(), 0.001));
    }
}