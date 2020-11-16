package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int value = 140;                            //rubles
        int euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " usd.");
    }
}
