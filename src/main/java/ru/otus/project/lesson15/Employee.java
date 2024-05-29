package ru.otus.project.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom", 24));
        employees.add(new Employee("George", 56));
        employees.add(new Employee("Kate", 18));

        System.out.println(getNames(employees));
        System.out.println(getMinAgeEmployee(employees, 40));
        System.out.println(checkMidlAge(employees, 35));
        System.out.println(findYoungestEmployee(employees));
    }

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static boolean checkMidlAge(List<Employee> employees, int minAveregeAge) {
        int totalAgeOfEmployees = 0;
        for (Employee employee : employees) {
            totalAgeOfEmployees += employee.getAge();
        }
        int averageAge = totalAgeOfEmployees / employees.size();
        return averageAge > minAveregeAge;
    }

    public static List<String> getMinAgeEmployee(List<Employee> employees, int minAge) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            int age = employee.getAge();
            if (age >= minAge) {
                names.add(employee.getName());
            }
        }
        return names;
    }

    public static List<String> getNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static Employee findYoungestEmployee(List<Employee> employees) {
        Employee youngest = employees.get(0);
        int minAge = youngest.getAge();
        for (Employee employee : employees) {
            int age = employee.getAge();
            if (age < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }
    @Override
    public String toString() {
        return "Youngest employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
