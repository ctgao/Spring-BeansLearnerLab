package com.example.SpringBeansLearnerLab.configurations;

import com.example.SpringBeansLearnerLab.models.Students;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {
    @Autowired
    private StudentConfig config;

    @Test
    public void contextLoads() throws Exception {
        assertThat(config).isNotNull();
    }

    @Test
    void currentStudents() {
        String expected = "3 Joe";
        Students actualStudents = config.currentStudents();
        Assert.assertEquals(expected, actualStudents.toString());
    }

    @Test
    void previousStudents() {
        String expected = "2 Kyle";
        Students actualStudents = config.previousStudents();
        Assert.assertEquals(expected, actualStudents.toString());
    }
}