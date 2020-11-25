package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                return index;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] arrayInt = new int[] {3, 7, 5, 12, -8, 9};
        int indexElOfArray = indexOf(arrayInt, 12);

        System.out.println(indexElOfArray);
    }
}
