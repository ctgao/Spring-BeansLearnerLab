package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.Instructors;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstructorConfigTest {
    @Autowired
    InstructorConfig instructorConfig;

    @Test
    void tcUsaInstructors() {
        String expected = "5 Minsoo";
        Instructors actualInstructors = instructorConfig.tcUsaInstructors();
        Assert.assertEquals(expected, actualInstructors.toString());
    }

    @Test
    void toUkInstructors() {
        String expected = "6 Dima";
        Instructors actualInstructors = instructorConfig.tcUkInstructors();
        Assert.assertEquals(expected, actualInstructors.toString());
    }

    @Test
    void getInstructors() {
        String expected = "1 Kris";
        Instructors actualInstructors = instructorConfig.getInstructors();
        Assert.assertEquals(expected, actualInstructors.toString());
    }
}