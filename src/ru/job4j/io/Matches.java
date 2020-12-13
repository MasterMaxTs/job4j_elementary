package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int value = 11;
    private static int count = 1;

    public static int getPlayer(int count) {
        return count % 2 == 0 ? 2 : 1;
    }

    public static void selecting() {
        while (value > 3) {
            System.out.println("Player #" + getPlayer(count) + " is choosing from 1 to 3 match: ");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            value -= select;
            count++;
        }
    }

    public static void isWin() {
        System.out.println("Player #" + getPlayer(count) + " is win!");
    }

    public static void main(String[] args) {
        selecting();
        isWin();
    }
}
