package ru.job4j.array;

public class Min {
    public static void main(String[] args) {
        int[] array = {4, 5, 3, 8};
        System.out.println(min(array));
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
