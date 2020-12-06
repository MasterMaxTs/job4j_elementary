package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean cond = left > right;
        return cond ? left : right;
    }

    public static int max(int num1, int num2, int num3) {
        return max(num1, max(num2, num3));
    }

    public static int max(int num1, int num2, int num3, int num4) {
        return max(num1, max(num2, max(num3, num4)));
    }
    public static void main(String[] args) {
        int rsl = Max.max(3, 6);
        System.out.println(rsl);
        rsl = Max.max(0, -34, 15);
        System.out.println(rsl);

    }
}
