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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[]rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
              rsl[i] = board[i][i];
            }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                return (monoHorizontal(board, i) || monoVertical(board, i));
                }
            }
        return result;
        }

    public static void main(String[] args) {
        int row = 1;
        int column = 2;
        char[][] matrixChar = {
                {'H', 'e', 'X', 'l', 'o'},
                {'X', 'X', 'X', 'X'},
                {'H', 'o', 'X', ' ', 'Y', 'o', 'u'},
        };

        for (int i = 0; i < matrixChar.length; i++) {
            for (int j = 0; j < matrixChar[i].length; j++) {
                System.out.print(" " + matrixChar[i][j]);
            }
            System.out.println();
        }

        System.out.println(row + " row. Result is " + monoHorizontal(matrixChar, row));
        System.out.println(column + " column. Result is " + monoVertical(matrixChar, column));
    }
}

