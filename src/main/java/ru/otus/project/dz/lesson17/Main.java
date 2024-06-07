package ru.otus.project.dz.lesson17;

public class Main {
    public static void main(String[] args) {
        PersonDateBase dataBase = new PersonDateBase();

        Person person1 = new Person("John", Position.DEVELOPER, 1L);
        Person person2 = new Person("George", Position.MANAGER, 2L);
        Person person3 = new Person("Alice", Position.JANITOR, 3L);

        dataBase.add(person1);
        dataBase.add(person2);
        dataBase.add(person3);

        System.out.println("Is person with ID 1 an employee? " + dataBase.isEmployee(1L));
        System.out.println("Is person with ID 2 an employee? " + dataBase.isEmployee(2L));
        System.out.println("Is person with ID 3 an employee? " + dataBase.isEmployee(3L));
        System.out.println("Is person with ID 4 an employee? " + dataBase.isEmployee(4L));
    }
}

