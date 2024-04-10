package org.example;

public class Task3 {
    public static void main(String[] args) {
        selectColor();
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
}
