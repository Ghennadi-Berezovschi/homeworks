import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a number from 1...5 : ");
        int numOfMethod = scanner.nextInt();
        System.out.println("You entered: " + numOfMethod);

        if(numOfMethod == 1) {
            greetings();
        } else if (numOfMethod == 2) {
            checkSign((int) (Math.random()*11-11) ,(int) (Math.random()*11-11),(int) (Math.random()*11-11));

        } else if (numOfMethod == 3) {
            selectColor();
        } else if (numOfMethod == 4) {
            compareNumbers();
        }
        else {
            addOrSubtractAndPrint((int) (Math.random()*11-11),(int) (Math.random()*11-11),random.nextBoolean());
        }


    }
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");

    }
    public static void checkSign(int a,int b, int c) {
        System.out.println("Random numbers are: " + a + "," + b + "," + c);
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
        System.out.println("Random numbers are: " + initValue + "," + delta + "," + increment);

        int result;

        if (increment) {
            result = initValue + delta;
            System.out.println(result);
        } else {
            result = initValue - delta;
            System.out.println("Result is: " + result);
        }
    }
}
