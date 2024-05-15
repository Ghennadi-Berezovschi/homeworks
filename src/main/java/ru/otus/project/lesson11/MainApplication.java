package ru.otus.project.lesson11;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",10,6);
        Horse horse = new Horse("Grom",20,300,4);
        Dog dog = new Dog("Bobik",20,250,4);

        horse.run(200);
        horse.swim(10);
        horse.info();
        System.out.println();
        dog.run(200);
        dog.swim(10);
        dog.info();
        System.out.println();
        cat.run(200);
        cat.info();

    }
}
