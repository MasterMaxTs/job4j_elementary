package ru.job4j.array;

public class Min {
    public static void main(String[] args) {
        int[] array = {4, 5, 3, 8};
        System.out.println(min(array));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
           if (array[i] < min) {
               min = array[i];
           }
        }
        return min;
    }
}
