package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int finish = 7;
        System.out.println("Количество простых чисел в диапазоне (2;" + finish + "): " + calc(finish));
    }
}
