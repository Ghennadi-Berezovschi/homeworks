package ru.otus.project.lesson11;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int endurance) {
        super(name, speedRun, endurance);

    }

    public void swim() {
        System.out.println("Cat cant swim");
    }


}
