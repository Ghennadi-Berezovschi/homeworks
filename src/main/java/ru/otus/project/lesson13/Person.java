package ru.otus.project.lesson13;

public class Person {
    private String name;
    private Transport currentTransport;

    public Person(String name) {
        this.name = name;
        this.currentTransport = null;
    }
    public void setCurrentTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " has mounted the " + transport.toString());
    }

    public void dismount() {
        if (this.currentTransport != null) {
            System.out.println(name + " has dismounted from the " + currentTransport.toString());
            this.currentTransport = null;
        } else {
            System.out.println(name + " is not on any transport");
        }
    }

    public boolean travel(String area, int distance) {
        if (currentTransport != null) {
            System.out.println(name + " is starting the journey...");
            return currentTransport.move(area, distance);
        } else {
            System.out.println(name + " has no transport to travel have to to walk.");
            return true;
        }
    }
}