package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {

            int min = Min.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);

            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 4, 1, 1, 3, 7, 5, 0, 2};
        for (int arr : array) {
            System.out.print(arr);                // Not sorted
        }
        System.out.println();

        for (int el : sort(array)) {              // Sort by selected
            System.out.print(el);
        }
    }
}
