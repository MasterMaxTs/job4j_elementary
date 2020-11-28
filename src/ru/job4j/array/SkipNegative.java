package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] number = {
                {1, -3, 3, 5, -8},
                {2, 5, -9, 4},
                {-6, 4}
        };
        int[][] arraySkip = skip(number);
        for (int i = 0; i < arraySkip.length; i++) {
            for (int j = 0; j < arraySkip[i].length; j++) {
                System.out.print(" " + arraySkip[i][j]);
            }
            System.out.println();
        }
    }
}
