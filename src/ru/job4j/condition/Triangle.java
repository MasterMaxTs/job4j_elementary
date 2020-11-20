package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static void main(String[] args) {
        double ab = 5;
        double ac = 7;
        double bc = 10;

        if (exist(ab, ac, bc)) {
            System.out.println("Треуголник со сторонами ab = " + ab + " ac = " + ac + "bc = " + bc + " существует");
        } else {
            System.out.println("Треуголник со сторонами ab = " + ab + " ac = " + ac + "bc = " + bc + " не существует!");
        }
    }
}
