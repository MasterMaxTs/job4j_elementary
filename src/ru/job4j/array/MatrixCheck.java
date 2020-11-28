package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int row = 2;
        char[][] matrixChar = {
                {'H', 'e', 'l', 'l', 'o'},
                {'X', 'X', 'X', 'X'},
                {'H', 'o', 'w', ' ', 'Y', 'o', 'u'},
        };

        for (int i = 0; i < matrixChar.length; i++) {
            for (int j = 0; j < matrixChar[i].length; j++) {
                System.out.print(" " + matrixChar[i][j]);
            }
            System.out.println();
        }

        System.out.println(row + " row. Result is " + monoHorizontal(matrixChar, row));
    }
}

