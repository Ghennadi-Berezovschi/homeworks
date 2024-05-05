package ru.otus.project.lesson10;

public class User {
    public static void main(String[] args) {
        User[] users = {
                new User("Kate", "Brown", 2002, "katebrown@gmail.com"),
                new User("George", "Birch", 1978, "georgebirch@gmail.com"),
                new User("Daniel", "Smith", 2003, "danielsmith@gmail.com"),
                new User("Olivia", "Williams", 1980, "olivia@gmai.com"),
                new User("William", "Miller", 1992, "william@.gmail.com"),
                new User("Liam", "Jones", 1981, "liam@gmail.com"),
                new User("Isabella", "Wilson", 1973, "isabella@gmail.com"),
                new User("Jack", "Davis", 2000, "jack@gmail.com"),
                new User("Ava", "Williams", 1979, "ava@gmai.com"),
                new User("Oscar", "Johnson", 1991, "oscar@.gmail.com"),
        };
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40) {
                users[i].infoOfUser();
                System.out.println();
            }

        }

    }

    String firstName;
    String lastName;
    int yearOfBirth;
    String email;

    public User(String firstName, String lastName, int dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = dateOfBirth;
        this.email = email;
    }

    public void infoOfUser() {
        System.out.println("Full name - " + firstName + " " + lastName);
        System.out.println("Year of birth - " + yearOfBirth);
        System.out.println("e-email - " + email);

    }

    public int getAge() {
        return 2024 - yearOfBirth;
    }

}
