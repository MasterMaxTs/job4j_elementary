package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;                               //salary will be after year. default
        percent = percent * 0.01;
        double remainder = amount * (1 + percent) - salary;
        while (remainder > 0) {
            remainder = remainder * (1 + percent) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {

        System.out.println(year(20000, 15000, 20));
    }
}
