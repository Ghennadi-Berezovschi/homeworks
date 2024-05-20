package ru.otus.project.lesson13;

public class Car implements Transport{
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(String area, int distance) {
        if (area.equals("plain")) {
            if (fuel >= distance/10) {
                System.out.println("Driving a Car for " + distance + " km on " + area);
                fuel -= distance/10;
                return true;
            } else {
                System.out.println("Car cannot move through " + area);
                return false;
            }
        } else {
            System.out.println("Car cannot move through " + area);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                '}';
    }
}
