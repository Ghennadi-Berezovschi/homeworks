package ru.otus.project.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RangeList {
    public  static void main(String[] args) {
        ArrayList<Integer> range = createRange(3, 9);
        System.out.println(range);
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        System.out.println(sumMoreThen5(numbers));
        List<Integer> myList = new ArrayList<>(List.of(2, 4, 6, 8));
        increaseMyList(3, myList);
        List<Integer> figures = new ArrayList<>(List.of(8,7,6,5));
        fillList(figures,10);

    }

    public static ArrayList<Integer> createRange(int min, int max) {
        ArrayList<Integer> rangeList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            rangeList.add(i);
        }
        return rangeList;
    }

    public static int sumMoreThen5(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    public static void fillList(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        System.out.println(list);
    }

    public static void increaseMyList(int a, List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int newValue = iterator.next() + a;
            iterator.set(newValue);
        }
        System.out.println(list);
    }

}
