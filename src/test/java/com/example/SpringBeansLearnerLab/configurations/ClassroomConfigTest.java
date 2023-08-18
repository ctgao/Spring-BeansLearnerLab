package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClassroomConfigTest {
    @Autowired
    ClassroomConfig classroomConfig;

    @Autowired
    StudentConfig mockStudents;

    @Autowired
    InstructorConfig mockInstructors;

    @Test
    void currentCohort() {
        String expectedInstructors = mockInstructors.getInstructors().toString();
        String expectedStudents = mockStudents.currentStudents().toString();

        Classroom actualClassroom = classroomConfig.currentCohort(
                mockInstructors.getInstructors(), mockStudents.currentStudents());

        Assert.assertEquals(expectedInstructors, actualClassroom.getInstructors().toString());
        Assert.assertEquals(expectedStudents, actualClassroom.getStudents().toString());
    }

    @Test
    void previousCohort() {
        String expectedInstructors = mockInstructors.getInstructors().toString();
        String expectedStudents = mockStudents.previousStudents().toString();

        Classroom actualClassroom = classroomConfig.previousCohort(
                mockInstructors.getInstructors(), mockStudents.previousStudents());

        Assert.assertEquals(expectedInstructors, actualClassroom.getInstructors().toString());
        Assert.assertEquals(expectedStudents, actualClassroom.getStudents().toString());
    }
}