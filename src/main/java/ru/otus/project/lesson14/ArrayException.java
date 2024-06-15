package ru.otus.project.lesson14;

public class ArrayException {
    public void checkArray(String[][] array) {
        if (array.length != 4) {
            throw new AppArraySizeException("Array must be 4*4");
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i].length != 4) {
                throw new AppArraySizeException(" Array must be 4*4");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e){
                    throw new AppArrayDateException("Incorrect date[" + i + "][" + j + "]");
                }


            }

        }

        System.out.println("Sum is: " + sum);
    }

}
