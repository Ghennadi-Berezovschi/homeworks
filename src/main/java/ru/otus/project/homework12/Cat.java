package ru.otus.project.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (plate.spendFood(appetite)) {
            System.out.println(name + " ate and is full");
            hungry = false;
        } else {
            System.out.println(name + " is still hungry.Not enough food in plate");

        }

    }
}