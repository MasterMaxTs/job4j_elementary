package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 180;                            //rubles
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + out + " euro. Test result: " + passed);
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " rubles are " + out + " usd. Test result: " + passed);

        int value = 140;
        int euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " usd.");
    }
}
