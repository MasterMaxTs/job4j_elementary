package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p05 = 0.5 * (a + b + c);
        return Math.sqrt(p05 * (p05 - a) * (p05 - b) * (p05 - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
