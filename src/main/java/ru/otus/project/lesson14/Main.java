package ru.otus.project.lesson14;

public class Main {
    public static void main(String[] args) {
        ArrayException arrayException = new ArrayException();

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] incorrectArray = {

                {"1", "2", "3","abc"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            arrayException.checkArray(correctArray);
            System.out.println("Correct array passed the check");
        } catch (AppArraySizeException e) {
            System.out.println("Correct array failed" + e.getMessage());
        } catch (AppArrayDateException e) {
            System.out.println("Array date exception: " + e.getMessage());
        }
        try {
            arrayException.checkArray(incorrectArray);
            System.out.println("Incorrect array passed the check");
        } catch (AppArraySizeException e) {
            System.out.println("Incorrect array failed: " + e.getMessage());
        } catch (AppArrayDateException e) {
            System.out.println("Array date exception: " + e.getMessage());

        }
    }
}
