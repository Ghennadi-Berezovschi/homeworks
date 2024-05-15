package org.example;

public class Task7 {
    public static void main(String[] args) {
        greetings();
        checkSign(4,5,6);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(34,45,true);
    }
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }
    public static void checkSign(int a,int b, int c){
        int result = a + b + c;
        if(result >= 0) {
            System.out.println("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");
        }
    }
    public static void selectColor() {
        int date = 5;
        if(date <= 10) {
            System.out.println("Red");
        } else if ( date <= 20) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }

    }
    public static void compareNumbers() {
        int a = 8;
        int b = 35;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
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
