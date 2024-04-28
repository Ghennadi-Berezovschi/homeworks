package org.example;

public class Task5 {
    public static void main(String[] args) {
        addOrSubtractAndPrint(5, 8, false);

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        int result;

        if (increment) {
            result = initValue + delta;
            System.out.println(result);
        } else {
            result = initValue - delta;
            System.out.println(result);
        }

    }
}
