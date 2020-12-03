package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int deltaX = Math.abs(x2 - x1);
        int deltaY = Math.abs(y2 - y1);
            return deltaX == deltaY ? deltaX : 0;
        }

    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 2;
        int x2 = 6;
        int y2 = 5;
        int countStep = ChessBoard.way(x1, y1, x2, y2);
        if (countStep != 0) {
            System.out.println("Число шагов хода слоном из позиции (" + x1 + ";" + y1 + ") "
                    + "в позицию (" + x2 + ";" + y2 + ") равно: " + countStep);
        } else {
            System.out.println("Так (" + x1 + ";" + y1 + ") => (" + x2 + ";" + y2 + ") слон не ходит!");
        }
    }
}
