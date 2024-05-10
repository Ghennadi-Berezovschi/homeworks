package ru.otus.project.lesson11;

public class Horse extends Animal {
    int speedSwim;
    public Horse(String name,int speedRun,int endurance,int speedSwim) {
        super(name,speedRun,endurance);
        this.speedSwim = speedSwim;
    }
    @Override
    public void info(){
        System.out.println("runCost of the horse after running is: " + runCost + " units");
        System.out.println("swimCost of the horse after swiming is: " + swimCost + " units");
    }

    public int swim(int distance){
        final int enduranceUnits = 4;
        this.distance = distance;

        this.swimCost = endurance - (distance * enduranceUnits);
        int time = distance / speedSwim;
        if (swimCost >= 0 && distance >= 0) {
            System.out.println(time + "s");
            return time;
        }
        else {
            System.out.println("Horse is   tired ");
        }

        return -1;
    }
}
