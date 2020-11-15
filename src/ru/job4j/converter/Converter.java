package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro (int value) {
        int rsl = value /70;   //rounded result
        return rsl;
    }

    public static int rubleToDollar (int value) {
        int rsl = value /60;  //rounded result
        return rsl;
    }

    public static void main(String[] args) {
        int value = 140;                            //rubles
        int euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are "+euro+" euro.");
        int dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are "+dollar+" usd.");
    }
}
