package ru.job4j.condition;

public class Cinemaa {
    public  static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Cinemaa.permission(true, true);
        Cinemaa.permission(true, false);
        Cinemaa.permission(false, true);
        Cinemaa.permission(false, false);
    }
}
