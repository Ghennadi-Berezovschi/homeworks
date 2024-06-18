package ru.otus.project.lesson12;

public class Plate {

    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = 0;

    }public boolean spendFood(int foodAmount){
        if(currentFood >= foodAmount){
            currentFood -= foodAmount;

            return true;
        }
        else return false;
    }

    public void addFood(int foodAmount) {
        if (currentFood + foodAmount <= maxFood) {
            currentFood += foodAmount;
            System.out.println(foodAmount + " added to the plate");
        } else {
            System.out.println("Could not add the food. Plate is too small");
        }
    }

}



