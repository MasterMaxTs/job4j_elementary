package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        System.out.println("Начальный массив:");
        viewArray(array);
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[2];
        array[2] = array[1];
        array[1] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        System.out.println("Упорядоченный по возрастанию массив:");
        viewArray(array);
        }

    public static void viewArray(int[] data) {
        for (int index : data) {
            System.out.print(index);
        }
        System.out.println();
    }
}
