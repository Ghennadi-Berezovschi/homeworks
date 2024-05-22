package ru.otus.project.lesson13;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("George");
        Transport horse = new Horse(3000);
        Transport car = new Car(100);
        Transport bicycle = new Bicycle(2000);
        Transport atv = new ATV(200);
        person.setCurrentTransport(car);
        person.travel("plain", 2000);
        person.dismount();
        person.setCurrentTransport(bicycle);
        person.travel("plain",1500);
        person.dismount();
        person.setCurrentTransport(horse);
        person.travel("forest",1000);
        person.dismount();
        person.setCurrentTransport(atv);
        person.travel("Swamp",1000);
        person.dismount();
    }



}
