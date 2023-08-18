package com.example.SpringBeansLearnerLab.models;

import java.util.Iterator;

public class Students extends People<Student>{
    public Students(){
        super();
    }

    public Students(Student... students){
        super(students);
    }
}
