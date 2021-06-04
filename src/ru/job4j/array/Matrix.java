package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static String showTable(int size) {
        int[][] table = multiple(size);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                stringBuilder.append("  ");
                stringBuilder.append(table[i][j]);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Matrix.showTable(9));
    }
}
