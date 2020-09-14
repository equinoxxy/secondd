package com.company;

public class Dog {

    private String name;
    private int age;

    public Dog() {}

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Your dog called " + this.name + " which is " + this.age + " y.o. (" + getHumanAge() + " in human years)";
    }

}
