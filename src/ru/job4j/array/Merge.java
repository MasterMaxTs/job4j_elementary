package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;                                                      /**left index  */
        int j = 0;                                                      /**Right index  */
        int z = 0;                                                      /**result array index  */
        while (z < result.length) {
            if (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    result[z] = left[i];
                    i++;
                } else {
                    result[z] = right[j];
                    j++;
                }
            } else {
                if (j < right.length) {
                    result[z] = right[j];
                    j++;
                }
                if (i < left.length) {
                    result[z] = left[i];
                    i++;
                }
            }
            z++;
        }
        return result;
    }

        public static void main(String[] args) {
        int[] left = {1, 4, 6};
        int[] right = {};
        for (int arr : merge(left, right)) {
            System.out.print(arr);
        }
    }
}
