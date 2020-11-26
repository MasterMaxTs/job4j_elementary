package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] dataBoolean = new boolean[] {true, true, false, true};
        boolean rst = mono(dataBoolean);

        for (boolean value : dataBoolean) {
            System.out.print(value);
        }
        System.out.println();
        System.out.println("Result is: " + rst);
    }

}
