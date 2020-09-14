package com.company;
import java.util.ArrayList;

public class DogFarm {

    private ArrayList<Dog> dogs = new ArrayList<Dog>();

    public DogFarm() {}

    public void addDog(Dog dog) {
        this.dogs.add(dog);
    }

}