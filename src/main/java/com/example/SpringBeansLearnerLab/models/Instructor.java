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
        double numOfLearners = 0;
        for(Learner l : learners){
            numOfLearners++;
        }
        double numberOfHoursPerLearner = numberOfHours / numOfLearners;
        learners.forEach(l -> teach(l, numberOfHoursPerLearner));
    }
}
