package ru.otus.project.lesson13;

public class ATV implements Transport{
    private int fuel;

    public ATV(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(String area, int distance) {

        if (area.equals("plain") || area.equals("swamp")) {
            if(fuel >= distance/20)
                System.out.println("Driving an ATV for " + distance + " km on " + area);
            fuel -= distance;
            return true;
        } else {
            System.out.println("Car cannot move through " + area);
            return false;
        }

    }

    @Override
    public String toString() {
        return "ATV{" +
                "fuel=" + fuel +
                '}';
    }
}
