package ru.otus.project.lesson11;

public class Horse extends Animal {
    int speedSwim;

    public Horse(String name, int speedRun, int endurance, int speedSwim) {
        super(name, speedRun, endurance);
        this.speedSwim = speedSwim;
    }


    public int swim(int distance) {
        final int enduranceUnits = 4;
        this.distance = distance;
        this.swimCost = endurance - (distance * enduranceUnits);

        int time = distance / speedSwim;
        if (swimCost >= 0 && distance >= 0) {
            endurance -= swimCost;
            System.out.println("After swimming left: " + endurance + "units");
            System.out.println("Horse swam " + distance + "m " + time + "s");
            return time;
        } else {
            System.out.println("The horse is   tired ");
        }

        return -1;
    }
}