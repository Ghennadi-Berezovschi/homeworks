package ru.otus.project.lesson11;

public class Dog extends Animal{
    int speedSwim;
    public Dog(String name,int speedRun,int endurance,int speedSwim) {
        super(name,speedRun,endurance);
        this.speedSwim = speedSwim;
    }
    @Override
    public void info(){
        System.out.println("runCost of dog after running is: " + runCost + " units");
        System.out.println("swimCost of dog after swiming is: " + swimCost + " units");
    }
    public int swim(int distance){
        final int enduranceUnits = 2;
        this.distance = distance;

        this.swimCost = endurance - (distance * enduranceUnits);
        int time = distance / speedSwim;
        if (swimCost >= 0 && distance >= 0) {
            System.out.println(time + "s");
            return time;
        }
        else {
            System.out.println("The dog is   tired ");
        }

        return -1;
    }
}
