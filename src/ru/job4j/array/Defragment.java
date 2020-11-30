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
        int nullIndex;
        int notNullIndex;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullIndex = i;
                for (int j = nullIndex + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        notNullIndex = j;
                        swap(array, nullIndex, notNullIndex);
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
