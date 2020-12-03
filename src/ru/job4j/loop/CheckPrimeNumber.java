package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;                     //always true
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;

    }

    public static void main(String[] args) {
        int number = 67;
        check(number);
        if (check(number)) {
            System.out.println(number + " - простое число");
        } else {
           System.out.println(number + " - непростое число");
        }
    }
}
