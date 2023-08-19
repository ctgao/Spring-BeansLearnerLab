package com.example.SpringBeansLearnerLab.models;

public class Instructor extends Person implements Teacher{
    private double numberOfHoursTaught;

    public Instructor(Long id, String name) {
        super(id, name);
        numberOfHoursTaught = 0.;
    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught += numberOfHours;
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
