package ru.otus.project.lesson11;

public abstract class Animal {
    protected String name;
    protected int speedRun;
    protected int endurance;
    protected int distance;
    protected int runCost;
    protected int swimCost;

    public Animal(String name, int speedRun, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }


    public int run(int distance) {

        final int enduranceUnits = 1;
        this.distance = distance;

        this.runCost = endurance - (distance * enduranceUnits);
        int time = distance / speedRun;


        if (runCost >= 0 && distance >= 0) {
            endurance -= runCost;
            System.out.println(name + " has " + endurance + "units  after running");
            System.out.println(name + " run " + distance + "m " + "for " + time + "s");
            return time;
        } else {
            System.out.println(name + " is tired and can not run");
        }

        return -1;
    }

}
