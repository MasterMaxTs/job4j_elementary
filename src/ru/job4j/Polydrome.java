package ru.job4j;

public class Polydrome {
    public boolean isPolydrome(String digits) {
        boolean rsl = true;
        char[] array = digits.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return rsl;
    }

}
