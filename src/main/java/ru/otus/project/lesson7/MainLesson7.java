package ru.otus.project.lesson7;

public class MainLesson7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, -3}, {5, -6, 7}};
        ofPositiveElements(array);
        char[][] square = new char[4][4];
        printSquare(square);
        System.out.println();
        printSquare2(6);
        System.out.println();
        int[][] matrix = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        zeroDiagonals(matrix);
        printMatrix(matrix);
        int[][] arr = {{-8, -3, 2, 8, 5}, {3, 6, -9, 2}};
        findMax(arr);
        int[][] row2 = {{1, 2, 4}, {5, 8, 2}};
        countAndSumRow2(row2);
    }

    public static int ofPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void printSquare(char[][] size) {
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size.length; j++) {
                size[i][j] = '*';
                System.out.print(size[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void printSquare2(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void zeroDiagonals(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j || i + j == columns - 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static int countAndSumRow2(int[][] arr) {
        if (arr.length < 2) {
            System.out.println(arr.length);
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }
        System.out.println(sum);
        return sum;
    }

}
