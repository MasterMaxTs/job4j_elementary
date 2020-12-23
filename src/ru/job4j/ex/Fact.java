package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(6));
        System.out.println(new Fact().calc(0));
        System.out.println(new Fact().calc(-3));
    }

    public int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        if(n < 0) {
            throw new IllegalArgumentException("factorial of negative number does not exist!");
        }
        return rsl;
    }
}
