package ru.otus.project.lesson13;

public class Horse implements Transport{
    private int animalEnergy;

    public Horse(int animalEnergy) {
        this.animalEnergy = animalEnergy;
    }

    @Override
    public boolean move(String area, int distance) {
        if (area.equals("forest") || area.equals("plain")) {
            if (animalEnergy >= distance) {
                System.out.println("Riding a Horse for " + distance + " km on " + area);
                animalEnergy -= distance;
                return true;
            } else {
                System.out.println("Horse cannot move through " + area);
                return false;
            }
        } else {
            System.out.println("Horse cannot move through " + area);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Horse{" +
                "animalEnergy=" + animalEnergy +
                '}';
    }
}
