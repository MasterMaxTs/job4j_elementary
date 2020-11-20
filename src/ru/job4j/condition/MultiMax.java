package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if ((first > second) && (first > third)) {
            return first;
        } else if ((second > first) && (second > third)) {
            return second;
        } else {
            return third;
        }
    }

    public static void main(String[] args) {
        int first = 7;
        int second = 16;
        int third = 12;
        System.out.println("Максимальное число из (" + first + " " + second + " " + third + ") равно: "
                + MultiMax.max(first, second, third));
    }
}
