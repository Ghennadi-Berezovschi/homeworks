package ru.otus.project.lesson13;

public class Bicycle implements Transport{
    private int riderEnergy;

    public Bicycle(int initialEnergy) {
        this.riderEnergy = initialEnergy;
    }

    @Override
    public boolean move(String area, int distance) {
        if (area.equals("plain")) {
            if (riderEnergy >= distance) {
                System.out.println("Riding a bicycle for " + distance + " km on " + area);
                riderEnergy -= distance;
                return true;
            } else {
                System.out.println("Not enough energy to ride the bicycle for " + distance + " km on " + area);
                return false;
            }
        } else {
            System.out.println("Bicycle cannot move through " + area);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "riderEnergy=" + riderEnergy +
                '}';
    }
}
