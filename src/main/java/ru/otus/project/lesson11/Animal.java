package ru.otus.project.lesson11;

public abstract class  Animal {
    private String name;
    private int speedRun;
    protected int endurance;
    protected int distance;
    protected int runCost;
    protected int swimCost;

    public Animal(String name, int speedRun, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }

    public abstract void info();

    public int run(int distance) {

        final int enduranceUnits = 1;
        this.distance = distance;

        this.runCost = endurance - (distance * enduranceUnits);
        int time = distance / speedRun;
        if (runCost >= 0 && distance >= 0) {
            System.out.println(time + "s");
            return time;
        } else {
            System.out.println("Animal  is tired ");
        }

        return -1;
    }

}
