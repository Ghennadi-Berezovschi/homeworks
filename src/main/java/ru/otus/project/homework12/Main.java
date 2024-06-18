package ru.otus.project.homework12;

public class Main {

    public static void main(String[] args) {
        Plate plate1 = new Plate(20);
        plate1.addFood(20);

        Cat[] cat = {
                new Cat("Barsic", 10),
                new Cat("Murzic", 8),
                new Cat("Pushok", 6)
        };
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate1);

        }
    }
}