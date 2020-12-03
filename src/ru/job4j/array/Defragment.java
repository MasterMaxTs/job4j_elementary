package ru.job4j.array;

public class Defragment {
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compress = compress(input);
        for (String str : compress) {
            System.out.print(str + " ");
        }
    }

    public static String[] compress(String[] array) {
        int index0;
        int index1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                index0 = i;
                for (int j = index0 + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        index1 = j;
                        swap(array, index0, index1);
                        break;
                    }
                }
            }
        }
        return array;
        }

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
}
