package ru.otus.project.lesson11;

public class Dog extends Animal {
    int speedSwim;

    public Dog(String name, int speedRun, int endurance, int speedSwim) {
        super(name, speedRun, endurance);
        this.speedSwim = speedSwim;
    }


    public int swim(int distance) {
        final int enduranceUnits = 2;
        this.distance = distance;
        this.swimCost = endurance - (distance * enduranceUnits);

        int time = distance / speedSwim;
        if (swimCost >= 0 && distance >= 0) {
            endurance -= swimCost;
            System.out.println("After swimming left: " + endurance + "units");
            System.out.println("Dog swam " + distance + "m " + time + "s");
            return time;
        } else {
            System.out.println("The dog is   tired ");
        }

        return -1;
    }
}
