package ru.otus.project.dz.lesson17;

public class BubbleSorter {
    public static void main(String[] args) {

        int[] array = {5, 2, 4, 9, 1, 8, 5, 6, 7, 3};
        bubblesSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(binarySearch(array, 4, 0, 10));
    }

    public static void bubblesSort(int[] array) {
        boolean swapped;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tempNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempNumber;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static int binarySearch(int[] array, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int middle = low + (high - low) / 2;

        if (key < array[middle]) {
            return binarySearch(array, key, low, middle - 1);
        } else if (key > array[middle]) {
            return binarySearch(array, key, middle + 1, high);
        } else {
            return middle;
        }
    }
}
