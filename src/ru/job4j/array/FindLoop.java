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

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        if (start < data.length && finish <= data.length) {              //search in range index of array
            for (int index = start; index < finish; index++) {
                if (data[index] == el) {
                    return index;
                }
            }
        } else if (start < data.length && finish > data.length) {        // finish > array.length
            for (int index = start; index < data.length; index++) {
                if (data[index] == el) {
                    return index;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] arrayInt = new int[] {3, 7, 5, 12, -8, 9, 5};
        int indexElOfArray = indexOf(arrayInt, 12);
        System.out.println(indexElOfArray);

        int indexElOfArrayFromRange = indexOf(arrayInt, 5, 1, 7);
        System.out.println(indexElOfArrayFromRange);
    }
}
