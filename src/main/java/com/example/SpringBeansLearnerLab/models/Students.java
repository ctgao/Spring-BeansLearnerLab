package com.example.SpringBeansLearnerLab.models;

public class Students extends People<Student>{
    public Students(Student... students){
        super(students);
    }
}
