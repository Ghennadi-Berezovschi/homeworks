package org.example;

public class Task2 {
    public static void main(String[] args) {
checkSign(5,6,-11);

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
}
