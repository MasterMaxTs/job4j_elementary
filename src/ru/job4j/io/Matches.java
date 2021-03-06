package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int value = 11;
    private static int count = 1;

    public static int getPlayer(int count) {
        return count % 2 == 0 ? 2 : 1;
    }

    public static void selecting() {
        while (value > 0) {
            System.out.println("Player #" + getPlayer(count) + " is choosing from 1 to 3 match: ");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            if (select > 0 && select < 4) {
                value -= select;
                System.out.println("There were " + value + " matches left on the table");
                count++;
            }
        }
        System.out.println("Player #" + getPlayer(count - 1) + " is win!");
    }

    public static void main(String[] args) {
        selecting();
    }
}
