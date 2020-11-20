package ru.job4j.condition;

public class LogicNot {

    public static Boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static Boolean isPositive(int num) {
        return num > 0;
    }

    public static Boolean notEven(int num) {
        return !isEven(num);
    }

    public static Boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static Boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        int num = 89;
        System.out.println("Число " + num + " - число чётное: " + isEven(num));
        System.out.println("Число " + num + " - число положительное: " + isPositive(num));
        System.out.println("Число " + num + " - число нечётное: " + notEven(num));
        System.out.println("Число " + num + " - число нечётное и положительное:" + notEvenAndPositive(num));
        System.out.println("Число " + num + " - число чётное или неположительное: " + evenOrNotPositive(num));

    }
}
