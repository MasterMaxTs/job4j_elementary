package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int number = 67;
       if (check(number)) {
            System.out.println(number + " - простое число");
        } else {
           System.out.println(number + " - непростое число");
       }
    }
}
