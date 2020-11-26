package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        int lastLeft = left[left.length - 1];
        int lastRight = right[right.length - 1];
        if (lastLeft != lastRight) {
            return false;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
