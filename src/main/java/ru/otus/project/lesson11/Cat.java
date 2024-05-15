package ru.otus.project.lesson11;

public class Cat extends Animal {
    public Cat(String name,int speedRun,int endurance) {
        super(name,speedRun,endurance);

    }
    @Override
    public void info(){
        System.out.println("runCost of the cat after running is: " + runCost + " units");
        System.out.println("The cat can not to swim");
    }

}
