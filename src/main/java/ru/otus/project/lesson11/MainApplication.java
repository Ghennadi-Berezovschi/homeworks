package ru.otus.project.lesson11;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",10,6);
        Horse horse = new Horse("Grom",20,400,5);
        Dog dog = new Dog("Bobik",20,250,5);

        horse.run(100);
        horse.swim(20);

        System.out.println();
        dog.run(200);
        dog.swim(10);

        System.out.println();
        cat.run(200);
        cat.swim();

    }
}
