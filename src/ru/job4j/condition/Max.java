package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean cond = left > right;
        return cond ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(3, 6);
        System.out.println(rsl);

        rsl = Max.max(0, -34);
        System.out.println(rsl);
    }
}
