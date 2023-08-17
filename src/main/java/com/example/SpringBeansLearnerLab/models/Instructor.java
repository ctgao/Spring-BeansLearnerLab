package com.example.SpringBeansLearnerLab.models;

public class Instructor extends Person implements Teacher{
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double numOfLearners = ((People) learners).size();
        double numberOfHoursPerLearner = numberOfHours / numOfLearners;
    }
}
