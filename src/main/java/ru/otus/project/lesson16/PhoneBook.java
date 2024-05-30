package ru.otus.project.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("George Burch", "+447552532075");
        phoneBook.add("Kate Howard", " + 448232531580");
        phoneBook.add("Tom Johnson", "+448792346790");
        phoneBook.add("George Burch", "+44345678900");
        System.out.println(phoneBook.find("George Burch"));
        System.out.println(phoneBook.find("Tom"));
        System.out.println(phoneBook.containsPhoneNumber("+447552532075"));
        System.out.println(phoneBook.findOwnerOfPhoneNumber("+447552532075"));
        phoneBook.printAllNumbers();

    }

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public List<String> find(String name) {
        System.out.print(name);
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> phoneNumbers : phoneBook.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public void printAllNumbers() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }

    public String findOwnerOfPhoneNumber(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
