package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index <= array.length / 2; index++) {
            if (index == array.length / 2) {
                break;
            }
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }

    public static void viewOfArray(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3, 4, 5};
        viewOfArray(input);

        int[] output = back(input);
        viewOfArray(output);

    }

}
