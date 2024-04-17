package org.example;

public class Main {
    public static void main(String[] args) {
        printStrNumbTimes(5, "Hello");
        sumMoreThan5(5, 6, 1, 3, 8, 9);
        fillNumber(3, 5, 6, 7, 8, 9);
        int[] array = {1, 2, 3, 4, 5};
        increaseNumber(4, array);
        compareSum(1, 3, 5, 7, 9, 8);


    }

    public static void printStrNumbTimes(int numbTimes, String inputStr) {
        for (int i = 0; i < numbTimes; i++) {
            System.out.println(inputStr);
        }
    }

    public static void sumMoreThan5(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > 5) {
                sum += args[i];
            }
        }
        System.out.println(sum);

    }

    public static void fillNumber(int number, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
            System.out.println(arr[i]);
        }

    }

    public static void increaseNumber(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + number;
            System.out.println(arr[i]);
        }
    }

    public static void compareSum(int... args) {
        int sumLeft = 0;
        int sumRight = 0;
        int midle = args.length / 2;
        for (int i = 0; i < midle; i++) {
            sumLeft += args[i];
        }
        for (int i = midle; i < args.length; i++) {
            sumRight += args[i];

        }
        if (sumLeft > sumRight) {
            System.out.println("sumLeft is: " + sumLeft);
        } else if (sumRight > sumLeft) {
            System.out.println("sumRight is: " + sumRight);
        } else {
            System.out.println("sumLeft == sumRight");

        }
    }

}