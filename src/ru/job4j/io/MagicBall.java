package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static String asking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Спросите что-нибудь?");
        return scanner.nextLine();
    }

    public static void answering(String question) {
        System.out.println("Вы спросили: " + question);
        String[] output = {"Да", "Нет", "Может быть"};
        int rand = new Random().nextInt(3);
        System.out.println("Ответ: " + output[rand]);
    }

    public static void main(String[] args) {
       answering(asking());
    }
}
