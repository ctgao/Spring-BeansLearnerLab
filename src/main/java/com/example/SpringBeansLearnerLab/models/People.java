package com.example.SpringBeansLearnerLab.models;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People(){
        personList = new ArrayList<>();
    }

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(PersonType... people){
        this.personList = new ArrayList<>(List.of(people));
    }

    public void add(PersonType pt){
        personList.add(pt);
    }

    public void remove(PersonType pt){
        personList.remove(pt);
    }

    public int size(){
        personList.size();
    }

    public void addAll(Iterable<PersonType> people){
        people.forEach(personList::add);
    }

    public PersonType findById(Long id){
        for(PersonType pt : personList){
            if(id.equals(pt.getId())){
                return pt;
            }
        }
        //BAD BAD BAD
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
