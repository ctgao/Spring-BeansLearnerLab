package com.example.SpringBeansLearnerLab.models;

public class Instructors extends People<Instructor>{
    public Instructors(){
        super();
    }

    public Instructors(Instructor... instructors){
        super(instructors);
    }
}
